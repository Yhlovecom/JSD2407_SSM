package com.tedu.mvc.demos.web.Controller;

import com.tedu.mvc.demos.web.pojo.dto.UserDTO;
import com.tedu.mvc.demos.web.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tedu.mvc.demos.web.mapper.UserMapper;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;//自动装配工具对象，使用不会对对象的属性造成影响因此可以公用。

    /**
     * 用户注册接口
     * @param userDTO 用户信息
     * @return 注册结果信息
     */
    @RequestMapping("/register")
    @ResponseBody
    public String register(UserDTO userDTO) {
        if (userDTO == null || userDTO.getUserName() == null || userDTO.getUserName().trim().isEmpty()/*判断用户名是否只含有空字段*/
            || userDTO.getPassword() == null || userDTO.getPassword().trim().isEmpty()/*判断密码是否只含有空字段*/) {
            return "输入信息不完整，请检查后重试";
        }

        User user = new User();
        user.setAge(userDTO.getAge());
        user.setUserName(userDTO.getUserName());
        user.setNickName(userDTO.getNickName()); // 假设UserDTO中有getNickName方法
        user.setPassword(userDTO.getPassword());
        user.setCreated(new Date());
        int result;
        try {
            result = userMapper.insertUser(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result > 0 ? "注册成功有" + result + "行数据受影响" : "注册失败";
    }

    @RequestMapping("/deleteUser")//删除用户数据，传入要删除的用户ID
    @ResponseBody
    public String deleteUser(@RequestParam("id") /*前端参数名*/ Integer id) {
        int result;
        try {
            result = userMapper.deleteUserById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result > 0 ? "删除成功有" + result + "行数据受影响" : "删除失败";
    }

    @RequestMapping("/deleteUsers")//批量删除用户数据，传入要删除的用户ID数组
    @ResponseBody
    public String deleteUsers(@RequestParam("ids") Integer[] ids) {
        int result;
        try {
            result = userMapper.deleteUserByIds(ids);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result > 0 ? "删除成功有" + result + "行数据受影响" : "删除失败";
    }

    @RequestMapping("/updateUser")//更新用户数据，传入要更新的用户信息
    @ResponseBody
    public String updateUser(UserDTO userDTO) {
        if (userDTO == null || userDTO.getId() == null || userDTO.getId() <= 0) {//必须指定用户ID
            return "请输入要修改用户的ID";
        }
        User user = new User();//封装用户数据,从前端输入对象到数据库对象
        user.setId(userDTO.getId()); //索引ID
        user.setAge(userDTO.getAge());
        user.setUserName(userDTO.getUserName());
        user.setNickName(userDTO.getNickName());
        user.setPassword(userDTO.getPassword());
        int result;
        try {//执行更新操作
            result = userMapper.updateUserById(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result > 0 ? "更新成功有" + result + "行数据受影响" : "更新失败";
    }

}
