package SpringDo.controllerDo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userDAOImpl_findUser")
public class UserDAOImpl implements IUserDAO{
    String name = "userDAOImpl_findUser:";
    @Override
    public boolean findUser() {//实现查找用户功能
        //利用随机数模拟查找用户是否存在的过程
        int i = (int)(Math.random()*2);//随机生成0或1
        if (i==0){
            System.out.println(name + "用户不存在");
            return false;
        }else{
            System.out.println(name + "用户存在");
            return true;
        }
    }
}
