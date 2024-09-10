package com.tedu.day06mybatis.mapper;

import com.tedu.day06mybatis.pojo.Comment;
import com.tedu.day06mybatis.pojo.CommentVO1;
import com.tedu.day06mybatis.pojo.CommentVO2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Insert("INSERT INTO comment(content,created,weibo_id,user_id) VALUES(#{content},#{created},#{weiboId},#{userId})")
    int insertComment(Comment comment);

    @Delete("DELETE FROM comment WHERE id=#{id}")
    int deleteCommentById(int id);

    @Update("UPDATE comment SET content=#{content},created=#{created},weibo_id=#{weiboId},user_id=#{userId} WHERE id=#{id}")
    int updateCommentById(Comment comment);

    @Select("SELECT content,user_id userId FROM comment WHERE id=#{id}")
    CommentVO1 selectCommentById(int id);

    @Select("SELECT id,content,user_id userId FROM comment WHERE user_id=#{id}")
    List<CommentVO2> selectCommentByUserId(int id);
}
