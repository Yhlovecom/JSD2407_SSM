package demo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring自动装配
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo4");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
