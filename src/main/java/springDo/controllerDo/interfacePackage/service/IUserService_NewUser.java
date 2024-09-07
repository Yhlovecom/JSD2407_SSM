package springDo.controllerDo.interfacePackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.dao.IUserDAO_NewUser;
import springDo.controllerDo.interfacePackage.input.IInPut;


@Component
public interface IUserService_NewUser {//新用户注册业务逻辑
    //连接数据库用户创建接口
    void NewUser(IInPut input);
}
