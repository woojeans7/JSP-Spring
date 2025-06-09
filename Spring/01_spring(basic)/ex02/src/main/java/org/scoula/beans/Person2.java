package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** org.scoula.beans 패키지에 Person2 클래스를 정의하세요.
 * 빈으로 자동 등록되도록 지정
 * name을 "Ella"로 지정
 * Parrot2를 오토와이어를 이용해 의존성 주입 지정
 */

@Component
public class Person2 {
    private String name = "Ella";

    @Autowired
    private Parrot2 parrot2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot2;
    }

    public void setParrot(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }
}
