package springDo.controllerDo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springDo.controllerDo.controller.UserController_NewUser;

@Configuration//标记为配置类
@ComponentScan("springDo.controllerDo") // 指定需要扫描的包
public class Demo02 { // 主程序入口
    public static void main(String[] args) {
        try ( AnnotationConfigApplicationContext context =
                      new AnnotationConfigApplicationContext(Demo02.class)){

            UserController_NewUser userControllerFindUser = context.getBean(UserController_NewUser.class);

            userControllerFindUser.NewUser("123456", "123456");
        }
    }
}