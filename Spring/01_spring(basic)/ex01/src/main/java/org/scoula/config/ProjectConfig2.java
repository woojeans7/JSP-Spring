package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** org.scoula.config 패키지에 ProjectConfig2 클래스를 정의하세요.
 * 3개의 Parrot 빈을 등록
 * 각각의 메서드와 각가의 Parrot의 name은 다음과 같음
 * parrot1(), "Koko"
 * parrot2(), "Miki"
 * parrot3(), "Riki"
 * parrot2의 빈 이름을 "miki"로 설정
**/
@Configuration
public class ProjectConfig2 {
    @Bean
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean(name = "miki") // 빈의 이름 등록 @Bean(value="miki"), @Bean("miki")
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    public Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
