package com.tedu.mvc.demos.web.mapper;


import com.tedu.mvc.demos.web.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {// 操作User表的数据库Mapper接口
    int insertUser(User user);//新增用户
    int deleteUserById(Integer id);//删除用户
    int deleteUserByIds(Integer[] id);//批量删除用户
    int updateUserById(User user);//更新用户
}