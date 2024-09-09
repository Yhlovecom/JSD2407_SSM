package demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * DAO   Data Access Object
 * DAO是项目分封的一个分层名，是一类专门与数据库打交道的类的总成。
 * 这些类在与数据库打交道时，希望用"面向对象"的思想将数据库中的数据进行表达
 * 类->表
 * 对象->表中的一条记录
 * 类属性->表中的字段
 * 希望程序用对象的形式表示表中的数据来对数据库操作
 * 以上思想目前知道即可，后面学习MyBatis时理解，ORM映射的思想
 *
 * 数据库中
 * UserInfo表
 * id   name    age   gender
 * 1    范传奇   22    男
 * 2    王克晶   33    女
 * ..   ..      ..    ..
 *
 *
 * UserInfo类
 * private int id;
 * private String name;
 * private int age;
 * private String gender;
 *
 * public void insert(UserInfo userInfo)
 *
 * public UserInfo query(String name)
 *
 */
@Component
public class UserDAO {
    //链接数据库时的地址
    //@Value注解可以被标注在属性上，Spring在创建对象时会同时根据该注解的参数来初始化该属性的值
    @Value("jdbc:mysql://localhost:3306/tedu")//url属性会被赋值为@Value()注解参数的值
    private String url;
    //数据库用户名
    @Value("root")
    private String username;
    //数据库密码
    @Value("root")
    private String password;

    @Override
    public String toString() {
        return "UserDAO{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}










