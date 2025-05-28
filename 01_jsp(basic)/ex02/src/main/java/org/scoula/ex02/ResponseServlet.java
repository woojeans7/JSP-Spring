package org.scoula.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// ResponseServlet 클래스를 추가하고, /response요청에 대해 다음 처럼 한글 응답을 내보내세요.
@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        // 한글이 깨지지 않도록 문자셋 설정
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        // html 작성 및 출력
        out.print("<html><body>");
        out.print("ResponseServlet 요청 성공");
        out.print("</body></html>");

    }
}
