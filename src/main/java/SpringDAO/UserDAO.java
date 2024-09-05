package SpringDAO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//注解，标识为组件用于Spring调用
public class UserDAO {//Data Access Object 数据访问对象(抽象关连)

    //新建数据库连接
    @Value("jdbc:mysql://localhost:3306/test")//注解，用于在调用时为其赋值
    private String url;//数据库连接地址

    @Value("root")
    private String username;//数据库用户名

    @Value("123456")
    private String password;//数据库密码

    //重写toString方法，输出数据库连接信息
    @Override
    public String toString() {
        return "DAO_Demo{" +
                "url=" + url + '\'' +
                ", username='" + username + '\'' +
                ", password" + password + '\'' +
                "}";
    }
}




