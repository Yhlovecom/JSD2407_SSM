package springDo.controllerDo;

import springDo.controllerDo.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Demo {//简单的mvc架构演示
    public static void main(String[] args) {//测试

        System.out.println("用户请求登录");
        String userID;//声明用户名
        String password;//声明密码

        //要求用户输入密码
        while(true){
            try (Scanner scanner = new Scanner(System.in)){
                System.out.println("请输入用户ID：");
                userID = scanner.nextLine();
                System.out.println("请输入密码：");
                password = scanner.nextLine();
                break;
            }catch (Exception e){
                System.out.println("输入错误，请重新输入");
            }
        }



        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("springDo.controllerDo")){

           UserController controller = context.getBean(UserController.class);
           controller.findUser(userID, password);//向控制器传入参数，响应用户需求

        }
    }
}
