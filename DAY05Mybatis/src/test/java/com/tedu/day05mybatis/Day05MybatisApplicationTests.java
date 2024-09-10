package com.tedu.day05mybatis;

import com.tedu.day05mybatis.mapper.WeiboMapper;
import com.tedu.day05mybatis.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Day05MybatisApplicationTests {
    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void testSelectWeiboContent() {
//        Weibo weibo = weiboMapper.selectContent(2);
        WeiboVO1 weibo = weiboMapper.selectContent(2);
        System.out.println(weibo);
    }
    @Test
    void testInsertWeibo() {
        Weibo weibo = new Weibo();
        weibo.setContent("测试数据");
        weibo.setCreated(new Date());
        weibo.setUserId(1);
        int num = weiboMapper.insert(weibo);
        System.out.println(num>0 ? "插入" + num + "条数据成功":"插入失败");
    }

    @Test
    void testDeleteWeiboById() {
        List<Integer>ids = List.of(1,2);
        int num = weiboMapper.deleteById(ids);
        System.out.println(num>0 ? "删除" + num + "条数据成功":"删除失败");
    }

    @Test
    void testUpdateWeibo() {
        Weibo weibo = new Weibo();
        weibo.setId(2);
        weibo.setContent("测试数据");
        weibo.setCreated(new Date());
        weibo.setUserId(1);
        int num = weiboMapper.updateById(weibo);
    }


    @Test
    void testFindByUserId() {//测试依据Id查询微博内容的功能
        Weibo weibo = weiboMapper.findById(2);
        System.out.println(weibo);
    }

    @Test
    void testFindAll() {
        System.out.println(weiboMapper.findAll());
    }

    @Test
    void selectCount() {

    }

    @Test
    void dynamicUpdate() {
        Weibo weibo = new Weibo();
        weibo.setId(2);
        weibo.setContent("测试数据");
        weibo.setCreated(new Date());
        weibo.setUserId(1);
        int num = weiboMapper.dynamicUpdate(weibo);
        System.out.println(num>0 ? "修改" + num + "条数据成功":"修改失败");
    }
}
