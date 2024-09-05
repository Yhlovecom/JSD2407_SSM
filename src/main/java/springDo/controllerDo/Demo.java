package springDo.controllerDo;

import springDo.controllerDo.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {//简单的mvc架构演示
    public static void main(String[] args) {//测试

        System.out.println("用户请求登录");

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("springDo.controllerDo")){

           UserController controller = context.getBean(UserController.class);
           controller.findUser();//响应用户需求

        }
    }
}
