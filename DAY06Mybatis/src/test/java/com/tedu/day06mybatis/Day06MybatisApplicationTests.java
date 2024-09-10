package com.tedu.day06mybatis;

import com.tedu.day06mybatis.mapper.WeiboMapper;
import com.tedu.day06mybatis.pojo.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Day06MybatisApplicationTests {
    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void testInsertWeibo(){
        for(int i=0;i<10;i++) {
            Weibo weibo = new Weibo();
            weibo.setContent("测试微博"+i);
            weibo.setCreated(new Date());
            weibo.setUserId(1);
            int num = weiboMapper.insert(weibo);
            System.out.println(num > 0 ? "插入成功" : "插入失败");
        }
    }

    @Test
    void testDeleteByIds(){
        int[] ids = {3,4,5};
        int num = weiboMapper.deleteByIds(ids);
        System.out.println(num>0?"删除成功":"删除失败");
    }

    @Test
    void testDeleteByIds2(){
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(14);
        list.add(15);
        int num = weiboMapper.deleteByIds2(list);
        System.out.println(num>0?"删除成功":"删除失败");
    }

}
