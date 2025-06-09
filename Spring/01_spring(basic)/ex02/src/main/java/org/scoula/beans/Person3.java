package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** org.scoula.beans 패키지에 Person3 클래스를 정의하세요.
 * 빈으로 자동 등록되도록 지정
 * name을 "Ella"로 지정
 * Parrot2를 생성자 주입을 통해 자동 설정
*/
@Component
public class Person3 {
    private String name = "Ella";

    private final Parrot2 parrot;

    // 생성자
    @Autowired
    public Person3(Parrot2 parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // final이기 때문에 set은 없고, get만 존재함.
    public Parrot2 getParrot() {
        return parrot;
    }
}
