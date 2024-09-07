package springDo.controllerDo.service;

import springDo.controllerDo.interfacePackage.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.input.IInPut;
import springDo.controllerDo.interfacePackage.service.IUserService;

@Component("userServiceImpl_findUser")
public class UserServiceImpl_findUser implements IUserService {//IUserService的实现类
    private static final String NAME = "userServiceImpl_findUser:";

    @Autowired//依赖于DAO，请求对象数据
    @Qualifier("userDAOImpl_findUser")
    private IUserDAO userDao;

    //实现查找用户功能
   public boolean findUser(IInPut input) {

       if (userDao.findUser(input)){
           System.out.println(NAME + "查找用户成功");
           return true;
       }else {
           System.out.println(NAME + "查找用户失败");
           return false;
       }
   }

}
