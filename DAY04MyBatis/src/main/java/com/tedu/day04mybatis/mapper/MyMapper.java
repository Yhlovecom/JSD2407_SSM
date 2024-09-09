package com.tedu.day04mybatis.mapper;

import com.tedu.day04mybatis.pojo.User;

import java.sql.*;

/**
 *  Mapper类的设计理念，以面向对象方式操作数据库中的数据
 *  例如，保存数据，只需要传入对象，这里会将对象信息保存到表中
 *  查询数据时，会将数据转换为对象再返回给调用方
 *
 */
public class MyMapper {

    public int insert(User user){
        //1:使用JDBC链接数据库
        //2:执行INSERT语句，将user对象内容插入到表user中
        //3:返回值表示影响了表中多少条记录
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/blog?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",//数据库的地址(格式大致相同，但是不同数据库也有差别)
                    "root",
                    "root"
            );
            String sql = "INSERT INTO user(username,password,nickname,age) " +
                         "VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNickname());
            ps.setInt(4, user.getAge());
            int num = ps.executeUpdate();
            connection.close();
            return num;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
