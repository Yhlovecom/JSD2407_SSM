package springDo.controllerDo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.dao.IGrout;
import springDo.controllerDo.interfacePackage.dao.IUserDAO;
import springDo.controllerDo.interfacePackage.input.IInPut;

import java.sql.*;

@Component("userDAOImpl_findUser")
public class UserDAOImpl_findUser implements IUserDAO {
    @Autowired
    @Qualifier("groutImpl")
    private IGrout grout;//调用连接数据库接口

    private static final  String NAME = "userDAOImpl_findUser:";//添加标识名

    public boolean findUser(IInPut input) {//实现查找用户功能

        System.out.println(NAME + "开始查找用户");
        try {
            Connection connection = grout.groutDate();//获取数据库连接对象

            PreparedStatement preparedStatement;//声明预编译对象

            String sql;//声明待执行的sql语句

            //转到相应的数据库
            sql = "use test";
            preparedStatement = connection.prepareStatement(sql);

            //拼接sql语句，查询用户是否存在
            sql = "select * from user where userID = '" + input.getUserID() +
                    "' and password = '" + input.getPassword() + "'";
            preparedStatement = connection.prepareStatement(sql);


        }catch(Exception e) {
            System.out.println(NAME + "操作数据库时发生错误");
        }

        //利用随机数模拟查找用户是否存在的过程
        int i = (int)(Math.random()*2);//随机生成0或1
        if (i==0){
            System.out.println(NAME + "用户不存在");
            return false;
        }else{
            System.out.println(NAME + "用户存在");
            return true;
        }
    }
}
