package org.scoula.ex06;

import org.scoula.ex06.command.Command;
import org.scoula.ex06.controller.HomeController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name = "FrontControllerServlet", value = "/")
public class FrontControllerServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;


    String prefix = "/WEB-INF/views/";
    String sufix = ".jsp";

    HomeController homeController = new HomeController();

    @Override
    public void init() throws ServletException {
        getMap = new HashMap<>();
        postMap = new HashMap<>();

        getMap.put("/", homeController::getIndex);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Command command = getCommand(req);
        if (command != null) {
            execute(command, req, resp);
        }
        else{ // 404 에러처리
            String view = prefix + "404" + sufix;
            RequestDispatcher dispatcher = req.getRequestDispatcher(view);
            dispatcher.forward(req, resp);
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); // post로 넘어오면 doGet으로 다시 넘김
    }

    private String getCommandName(HttpServletRequest req){
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest req){
        String commandName = getCommandName(req);

        Command command;
        if(req.getMethod().equalsIgnoreCase("GET")){
            command = getMap.get(commandName);
        }
        else{
            command = postMap.get(commandName);
        }
        return command;
    }

    public void execute(Command command, HttpServletRequest req, HttpServletResponse resp )
            throws IOException, ServletException {
        String viewName = command.execute(req, resp);
        if(viewName.startsWith("redirect:")){
            resp.sendRedirect(viewName.substring("redirect:".length()));
        }
        else{
            String view = prefix + viewName + sufix;
            RequestDispatcher dispatcher = req.getRequestDispatcher(view);
            dispatcher.forward(req, resp);
        }
    }
}
