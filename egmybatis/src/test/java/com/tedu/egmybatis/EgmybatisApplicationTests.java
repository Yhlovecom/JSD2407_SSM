package com.tedu.egmybatis;

import com.tedu.egmybatis.mapper.CommentMapper;
import com.tedu.egmybatis.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class EgmybatisApplicationTests {
    @Autowired
    private CommentMapper commentMapper;
    @Test
    void testInsertComment() {// 测试插入评论
        Comment comment = new Comment();
        comment.setContent("评论内容");
        comment.setCreated(new Date());
        comment.setUserId(1);
        comment.setWeiboId(1);
        int num = commentMapper.insertComment(comment);
    }
}
