package springDo.controllerDo.controller;

import springDo.controllerDo.service.IUserService;
import springDo.controllerDo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {//控制器
    private static final String name = "UserController_findUser:";

    @Autowired//依赖service，请求service响应用户需求
    @Qualifier("userServiceImpl")
    private IUserService userService;//注入

    public void findUser(String userID,
                         String password) {
        if (userService.findUser(userID,password)){
            System.out.println(name + "用户存在，登录成功");
            System.out.println(name + "欢迎！");
        }else{
            System.out.println(name + "用户不存在，登录失败");
        }
    }
}
