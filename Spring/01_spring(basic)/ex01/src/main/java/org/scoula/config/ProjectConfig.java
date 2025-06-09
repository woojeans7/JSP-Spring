package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 스프링의 Configuration 클래스로 정의
 * Parrot을 빈으로 등록
 * Parrot의 name을 "Koko"로 설정
 **/

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
