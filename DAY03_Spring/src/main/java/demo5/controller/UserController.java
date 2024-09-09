package demo5.controller;

import demo5.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller将来用于和用户打交道(与浏览器交互部分)
 *
 * UserController负责处理来自浏览器(用户)和用户信息相关的请求
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    public void doLogin(){
        System.out.println("UserController:收到用户请求，要求登录");
        boolean success = userService.login("张三","123456");
        if(success){
            System.out.println("UserController:回馈用户登录成功提示");
        }else{
            System.out.println("UserController:回馈用户登录失败提示");
        }

    }
}







