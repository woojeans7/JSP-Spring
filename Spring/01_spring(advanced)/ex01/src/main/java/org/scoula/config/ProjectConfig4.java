package org.scoula.config;

import org.scoula.beans.Person;
import org.scoula.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // context파일로 인식됨.
public class ProjectConfig4 {

    // java context 파일로 주입하는 방법 2가지
    // 1. set() 메서드 이용 : 먼저 Person이 만들어지고

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person(); // 객체 생성 후, 주입하는 경우 set메서드 이용해서 주입 가능!
        p.setName("Ella");
        //p.setParrot(parrot()); // 주입할 때 set메서드 호출할 수 있음.
        p.setParrot(parrot); // Person 만들기 전에 이미 만들어진 parrot 싱글톤 객체를 찾아서 주입
        return p;
    }
}
