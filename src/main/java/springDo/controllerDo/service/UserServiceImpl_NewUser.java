package springDo.controllerDo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.dao.IUserDAO_NewUser;
import springDo.controllerDo.interfacePackage.input.IInPut;
import springDo.controllerDo.interfacePackage.service.IUserService_NewUser;

@Component("userServiceImpl_NewUser")
public class UserServiceImpl_NewUser implements IUserService_NewUser {
    private static final String NAME = "userServiceImpl_NweUserImpl:";
    @Autowired
    @Qualifier("userDAOImpl_NewUser")
    IUserDAO_NewUser userDAO_NewUser;

    @Override
    public void NewUser(IInPut input) {//请求数据库中创建新用户数据功能
        System.out.println(NAME + "请求数据库");
        userDAO_NewUser.newUser(input);
    }
}
