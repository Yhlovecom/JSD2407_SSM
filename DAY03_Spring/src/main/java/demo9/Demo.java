package demo9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo9");
        DBUtil dbUtil = context.getBean(DBUtil.class);
        System.out.println(dbUtil);
    }
}
