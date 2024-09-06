package springDo.controllerDo.dao;

import org.springframework.stereotype.Component;

@Component("userDAOImpl")
public class UserDAOImpl implements IUserDAO{

    private static final  String name = "userDAOImpl_findUser:";//添加标识名

    public boolean findUser(String userID,
                            String password) {//实现查找用户功能
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
