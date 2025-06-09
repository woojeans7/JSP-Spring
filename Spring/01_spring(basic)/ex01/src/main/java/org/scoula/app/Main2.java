package org.scoula.app;

import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** org.scoula.app 패키지에 Main2 클래스를 정의하세요.
 * ProjectConfig2를 설정 클래스로하여 Spring Context를 생성
 * 컨텍스트를 이용하여 "miki" 이름의 빈을 추출
 * 추출된 Parrot의 name 출력
 */
public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Parrot p = context.getBean("miki", Parrot.class);
        System.out.println(p.getName());
    }
}
