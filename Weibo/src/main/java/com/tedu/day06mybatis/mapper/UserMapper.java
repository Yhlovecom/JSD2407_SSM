package com.tedu.day06mybatis.mapper;

import com.tedu.day06mybatis.pojo.User;
import com.tedu.day06mybatis.pojo.WeiboVO3;
import org.apache.ibatis.annotations.Mapper;

@Mapper //操作User表的数据库Mapper接口
public interface UserMapper {
    User selectUserAndWeiboById(int id);//根据id查询用户信息，同时查询出用户所对应的微博信息（一对多关系）

    WeiboVO3 selectUserAndCommentById(int id);//根据id查询用户信息，同时查询出用户所对应的评论信息（一对多关系）
}
