package springDo.controllerDo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.dao.IGrout;
import springDo.controllerDo.interfacePackage.dao.IUserDAO_NewUser;
import springDo.controllerDo.interfacePackage.input.IInPut;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Component("newUser")
public class UserDAO_NewUserImpl implements IUserDAO_NewUser {

    @Autowired
    @Qualifier("groutImpl")
    IGrout grout;//装配数据连接对象
    @Override
    public void newUser(IInPut inPut) {
        PreparedStatement preparedStatement;

        String sql;
        try(Connection connection =grout.groutDate()/*新建数据库连接*/) {
            //切换到用户数据库
            connection.createStatement().execute("use user");

            sql = "insert into user(userID,password) values(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,inPut.getUserID());
            preparedStatement.setString(2,inPut.getPassword());
            preparedStatement.executeUpdate();//执行sql语句，插入数据

        }catch(Exception e) {
            System.out.println("创建新用户时发生错误");
        }
    }
}
