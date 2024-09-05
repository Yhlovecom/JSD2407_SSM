package SpringDo.controllerDo.service;

import SpringDo.controllerDo.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService{//IUserService的实现类

    @Autowired//依赖于数据库
    @Qualifier("userDAOImpl_findUser")
    private IUserDAO userDao;


}
