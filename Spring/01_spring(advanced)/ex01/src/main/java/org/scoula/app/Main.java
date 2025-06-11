package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();

        parrot.setName("Test");
        System.out.println(parrot.getName());
        System.out.println(parrot); // 주소1

        // 스프링이 객체를 생성한 것을 가지고 와서 사용해보자.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot2 = context.getBean(Parrot.class); // Parrot클래스로 만들어진 객체 get!
        System.out.println(parrot2.getName());
        System.out.println(parrot2); // 주소2

        Parrot parrot3 = context.getBean(Parrot.class);
        System.out.println(parrot3); // 주소3 -> 싱글톤이라서 여러 번 해도 하나만 가져옴
    }
}
