package org.scoula.config;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** org.scoula.config 패키지에 ProjectConfig 설정 클래스를 정의하세요.
 * 다음과 같이 빈을 등록
 * Parrot
 * name 속성: Koko
 * Person
 * name 속성: Ella
 */

// 메서드의 의존성 주입을 통해 Parrot을 주입하도록 설정
@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot);
        return person;
    }
}
