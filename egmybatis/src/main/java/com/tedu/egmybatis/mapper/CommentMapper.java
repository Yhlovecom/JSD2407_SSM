package com.tedu.egmybatis.mapper;



import com.tedu.egmybatis.pojo.Comment;
import com.tedu.egmybatis.pojo.CommentVO1;
import com.tedu.egmybatis.pojo.CommentVO2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface CommentMapper {//评论功能操作接口

    int insertComment(Comment comment);

    int deleteComment(Integer id);

    int updateComment(Comment comment);

    CommentVO1 selectCommentById(Integer id);

    List<CommentVO2> selectCommentByUserId(Integer id);
}
