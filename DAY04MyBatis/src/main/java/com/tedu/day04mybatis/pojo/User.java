package com.tedu.day04mybatis.pojo;

import java.util.Date;

/**
 * ORM 对象关系映射
 * 该思想希望以"面向对象"的方式操作数据库中的数据
 * 基本概念:
 * java中一个类用于描述数据库中的一张表
 * 类中的属性用于描述表中的字段
 * 类的每一个实例用于描述表中的一条具体数据(记录)
 *
 * 例如:blog数据库中有一张表user
 * 那么我们就可以在java中设计一个类名字与表一致:User  大小写还是遵从java中的命名规则
 *
 * CREATE TABLE user(
 *     id INT PRIMARY KEY AUTO_INCREMENT,      #主键
 *     username VARCHAR(30),                   #用户名
 *     password VARCHAR(30),                   #密码
 *     nickname VARCHAR(30),                   #昵称
 *     age INT(3),                             #年龄
 *     created TIMESTAMP                       #注册日期
 * );
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
    //数据库中字段默认值可以是NULL，如果用基本类型表示，无法表达默认值NULL，因此要用引用类型
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                ", age=" + age +
                '}';
    }
}
