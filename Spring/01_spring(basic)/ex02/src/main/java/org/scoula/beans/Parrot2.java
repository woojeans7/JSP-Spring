package org.scoula.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/** org.scoula.beans 패키지에 Parrot2 클래스를 정의하세요.
 * 자동 등록되도록 지정
 * name을 "Koko"로 지정
 */
@Component
public class Parrot2 {
    private String name = "Koko"; // 위험, 그래서 보통은 변경 안되도록 final을 붙임.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot2 : " + name;
    }
}
