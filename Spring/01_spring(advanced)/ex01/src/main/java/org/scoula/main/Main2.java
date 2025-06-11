package org.scoula.main;

import org.scoula.beans.Parrot2;
import org.scoula.beans.Person;
import org.scoula.beans.Parrot;
import org.scoula.beans.Person2;
import org.scoula.config.ProjectConfig5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig5.class);
        Person person = context.getBean(Person2.class);
        Parrot parrot = context.getBean(Parrot2.class);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's parrot : " + person.getParrot());


    }
}
