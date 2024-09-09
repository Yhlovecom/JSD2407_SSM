package demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        //如何为属性初始化？
        System.out.println(userDAO);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("demo3");
        UserDAO userDAO2 = context.getBean(UserDAO.class);
        System.out.println(userDAO2);


        Person p1 = new Person();
        p1.setName("王克晶");
        p1.setAge(18);
        System.out.println(p1);

        Person p2 = context.getBean(Person.class);
        System.out.println(p2);

    }
}
