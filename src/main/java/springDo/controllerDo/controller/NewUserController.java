package springDo.controllerDo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.input.IInPut;
import springDo.controllerDo.interfacePackage.service.IUserService_NewUser;

@Component
public class NewUserController {
    private static final String name = "UserController_findUser:";

    @Autowired
    @Qualifier("userServiceImpl_NewUser")
    private IUserService_NewUser userService;
    @Autowired
    @Qualifier("inPutImpl")
    private IInPut input;

    public void NewUser(String userID,
                        String password) {
        System.out.println(name + "开始响应用户注册请求");
        input.updateUser(userID,password);
        userService.NewUser(input);
    }
}
