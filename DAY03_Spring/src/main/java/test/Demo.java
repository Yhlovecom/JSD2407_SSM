package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("test");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
