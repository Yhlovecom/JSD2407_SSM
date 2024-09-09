package com.tedu.day05mybatis;

import com.tedu.day05mybatis.mapper.WeiboMapper;
import com.tedu.day05mybatis.pojo.Weibo;
import com.tedu.day05mybatis.pojo.WeiboVO1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
