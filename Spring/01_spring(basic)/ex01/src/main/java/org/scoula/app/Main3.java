package org.scoula.app;

import org.scoula.config.ProjectConfig3;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** org.scoula.app 패키지에 Main3 클래스를 정의하세요.
 * ProjectConfig3을 설정 클래스로하여 Spring Context를 생성
 * Parrot 빈 추출
 * 추출된 Parrot의 name 출력
 */
public class Main3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
