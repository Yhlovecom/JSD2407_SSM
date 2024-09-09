package demo5.service;

import demo5.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDAO userDao;

    @Override
    public boolean login(String username, String password) {
        System.out.println("UserService:开始处理用户登录操作");
        System.out.println("UserService:验证用户信息是否有误");
        System.out.println("UserService:获取用户信息...");
        boolean success = userDao.findUser();
        if (success) {
            System.out.println("UserService:用户登录成功");
        }else{
            System.out.println("UserService:用户登录失败");
        }
        return success;
    }
}
