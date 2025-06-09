package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// org.scoula.domain 패키지에 Parrot 클래스를 정의하세요.
// 필드 : String name
// name에 대한 Getter/Setter 추가

// Parrot 클래스를 컴포넌트 스캔을 통해 빈으로 자동 등록되도록 정의하세요.
// @PostConstruct를 이용하여 빈의 name 속성을 "Kiki"로 설정

@Component
public class Parrot {
    private String name; // 접근제한자 추가

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
