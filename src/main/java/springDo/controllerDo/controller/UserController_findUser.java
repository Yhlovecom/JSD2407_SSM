package springDo.controllerDo.controller;

import springDo.controllerDo.interfacePackage.input.IInPut;
import springDo.controllerDo.interfacePackage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController_findUser {//控制器
    private static final String NAME = "UserController_findUser:";

    @Autowired//依赖service，请求service响应用户需求
    @Qualifier("userServiceImpl_findUser")
    private IUserService userService;//注入

    @Autowired
    @Qualifier("inPutImpl")
    private IInPut input;

    public void findUser(String userID,
                         String password) {//账号验证方法

        System.out.println(NAME + "开始响应用户登录请求");

        input.updateUser(userID,password);//打包为对象

        if (userService.findUser(input)){
            System.out.println(NAME + "用户存在，登录成功");
            System.out.println(NAME + "欢迎！");
        }else{
            System.out.println(NAME + "用户不存在，登录失败");
        }
    }
}
