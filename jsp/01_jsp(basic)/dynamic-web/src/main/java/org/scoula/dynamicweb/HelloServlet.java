package org.scoula.dynamicweb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    // /hello-servlet 요청이 왔을 때 다음과 같이 출력하세요.
    public void init() {
        message = "Hello Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        // "홈으로" 링크 설정, 링크 클릭 시 홈으로 이동
        out.println("<a href=\"/\">Home</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}