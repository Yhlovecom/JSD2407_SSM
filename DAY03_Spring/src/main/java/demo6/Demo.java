package demo6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试@Resource注解
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo6");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
