package org.scoula.config;

//Parrot 클래스를 컴포넌트 스캔을 통해 빈으로 자동 등록되도록 ProjectConfig3 설정 클래스를 정의하세요.

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.scoula.domain")
public class ProjectConfig3 {
}
