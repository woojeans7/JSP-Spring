package org.scoula.ex03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sports")
public class SportsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        String[] sports = req.getParameterValues("sports");
        String sex = req.getParameter("sex");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<html><body>");
        for (String sport : sports) {
            out.print("좋아하는 운동: " + sport + "<br>");
        }
        out.print("성별 : " + sex + "<br>");
        out.print("</body></html>");
    }
}
