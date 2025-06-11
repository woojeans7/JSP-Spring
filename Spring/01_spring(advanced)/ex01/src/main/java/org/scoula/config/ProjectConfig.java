package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 객체생성할 때 설정파일로 2가지 중 하나를 사용함.
// 1. xml파일, 2. java파일(***)

@Configuration
public class ProjectConfig {
    @Bean  // 스프링에 싱글톤으로 만들어야한다고 알려주는 어노테이션
    // 이 함수는 스프링이 불러서 싱글톤으로 만든다.
    // 내가 만든 클래스는 클래스이름위에 @Bean이라고 하면 싱글톤으로 만들어줌.
    // Config파일에 넣는 경우에는 내가 만든 것이 아닌 경우
    // 클래스를 열어서 @Bean을 붙여줄수가  없음. 이런 경우 Config파일에서 객체를
    // 생성하고 조립하게 해야함.
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("KoKo");
        return p; //스프링이 싱글톤으로 만들어서 관리(공장처럼)
    }
}
