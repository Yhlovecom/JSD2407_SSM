package demo5;

import demo5.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo5");
        UserController controller = context.getBean(UserController.class);
        controller.doLogin();
    }
}
