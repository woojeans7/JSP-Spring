package org.scoula.ex02;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// HelloServlet 클래스에서 @WebServlet을 주석 처리한 후, HelloServlet이 동작하도록 web.xml을 수정하세요.
// @WebServlet(name = "helloServlet", value = "/hello-servlet")
// 다음 두 url에 HelloServlet이 맵핑되도록 @WebServlet을 설정하세요.
@WebServlet(name = "helloServlet", value = {"/hello-servlet", "/xxx", "/yyy"} )
public class HelloServlet extends HttpServlet {
    private String message;

    // HelloServlet에 생명주기 메서드 init(), destroy()를 재정의하고, 해당 메서드가 호출되는지 확인하세요.
    @Override
    public void init() {
        message = "Hello Servlet!";
        System.out.println("init 호출 확인!");
    }
    @Override
    public void destroy() {
        System.out.println("destroy 호출 확인!");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }


}