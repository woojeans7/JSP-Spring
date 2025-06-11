package org.scoula.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 싱글톤으로 만들어주고, 스프링에 이 클래스가 컨트롤러 역할을 하는 클래스라고 등록
@Controller
public class HomeController {

    @GetMapping("/") // "/" 주소로 get요청이 들어오면
    public String home(Model model) {
        System.out.println("HomeController ===== ");
        model.addAttribute("name", "홍길동");
        return "index"; // view 파일 이름 프런트컨트롤러에서 리턴함.

        // 뷰 리졸버가 /WEB-INF/views/index.jsp를 붙여서
        // 프런트컨트롤러가 불러야할 파일명으로 만들어줌.(렌더링)
    }
}
