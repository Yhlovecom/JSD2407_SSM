package com.tedu.day04mybatis;

import com.tedu.day04mybatis.mapper.MyMapper;
import com.tedu.day04mybatis.mapper.StudentMapper;
import com.tedu.day04mybatis.mapper.UserMapper;
import com.tedu.day04mybatis.mapper.WeiboMapper;
import com.tedu.day04mybatis.pojo.Student;
import com.tedu.day04mybatis.pojo.User;
import com.tedu.day04mybatis.pojo.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class Day04MyBatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsert(){
        User user = new User();
        user.setUsername("范传奇");
        user.setPassword("123456");
        user.setNickname("传奇");
        user.setCreated(new Date());
        user.setAge(22);

//        MyMapper mappers = new MyMapper();
//        int num = mappers.insert(user);

        int num = userMapper.insert(user);
        System.out.println(num>0?"保存成功":"保存失败");
    }

    @Test
    void testInsertStu(){
        Student student = new Student();
        student.setName("张三");
        student.setAge(22);
        student.setGender("男");
        int num = studentMapper.insert(student);
        System.out.println(num>0?"保存成功":"保存失败");
    }

    @Test
    void testInsertWeibo(){
        Weibo weibo = new Weibo();
        weibo.setContent("今天星期五了！");
        weibo.setCreated(new Date());
        weibo.setUserId(2);

        int num = weiboMapper.insert(weibo);
        System.out.println(num>0?"保存成功":"保存失败");
    }

    @Test
    void testDeleteWeibo(){
        int num = weiboMapper.deleteById(1);
        System.out.println(num>0?"删除成功":"删除失败");
    }

    @Test
    void testDeleteStudent(){
        int num = studentMapper.deleteByName("张三");
        System.out.println(num>0?"删除成功":"删除失败");
    }

    @Test
    void updateWeibo(){
        Weibo weibo = new Weibo();
        weibo.setId(2);
        weibo.setContent("明天是星期六了~~~");
        weibo.setCreated(new Date());
        weibo.setUserId(3);
        int num = weiboMapper.updateById(weibo);
        System.out.println(num>0?"修改成功":"修改失败");
    }

    @Test
    void testFindWeibo(){
        Weibo weibo = weiboMapper.findById(2);
        System.out.println(weibo);
    }

    @Test
    void testFindAllWeibo(){
        List<Weibo> weiboList = weiboMapper.findAll();
//        weiboList.forEach(System.out::println);

        for(Weibo weibo : weiboList){
            System.out.println(weibo);
        }
    }

}
