package org.scoula.main;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.scoula.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** org.scoula.main 패키지에 Main 클래스를 정의하세요.
 * ProjectConfig를 설정으로 컨텍스트 생성
 * Person과 Parrot 빈을 추출
 * 추출된 빈의 속성 출력
 *  - Person's name
 *  - Prrot's name
 *  - Person's parrot
 */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
