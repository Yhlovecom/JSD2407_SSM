package com.tedu.day04mybatis.mapper;

import com.tedu.day04mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /*
        JDBC时预编译SQL:
        INSERT INTO user(username,password,nickname,created,age)
        VALUES(?,?,?,?,?)
        ?分别对应user对象中各属性值

        在mybatis中的占位符:#{},在{}中指定user对象属性的名字即可
        INSERT INTO user(username,password,nickname,created,age)
        VALUES(#{username},#{password},#{nickname},#{created},#{age})
                    ^
            User的username属性
     */
    @Insert("INSERT INTO user(username,password,nickname,created,age) VALUES(#{username},#{password},#{nickname},#{created},#{age})")
    int insert(User user);
}
