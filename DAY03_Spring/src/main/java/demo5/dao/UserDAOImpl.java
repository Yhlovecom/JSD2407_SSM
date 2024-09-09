package demo5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements IUserDAO{

    @Override
    public boolean findUser() {
        System.out.println("UserDAO:根据用户名，密码查找用户信息");
        double r = Math.random();//0.0-1.0
        if(r>0.5){
            System.out.println("UserDAO:找到该用户将其返回");
            return true;//找到该用户
        }else{
            System.out.println("UserDAO:未找到该用户！");
            return false;
        }
    }
}






