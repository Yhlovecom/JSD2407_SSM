package springDo.controllerDo.dao.grout;

import org.springframework.stereotype.Component;
import springDo.controllerDo.interfacePackage.dao.IGrout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component("groutImpl")
public class GroutImpl implements IGrout {//创建数据库连接
private static final String NAME = "groutImpl:" ;
    public Connection groutDate() {
        try {//创建数据库连接对象
            Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "123456"
            );//创建数据库连接对象并上传

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(NAME + "数据库连接失败");
            throw new RuntimeException(e);
        }
    }
}
