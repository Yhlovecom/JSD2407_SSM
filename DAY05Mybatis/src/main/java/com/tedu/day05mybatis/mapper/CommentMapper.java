package com.tedu.day05mybatis.mapper;

import com.tedu.day05mybatis.pojo.Comment;
import com.tedu.day05mybatis.pojo.CommentVO1;
import com.tedu.day05mybatis.pojo.CommentVO2;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CommentMapper {//评论功能操作接口
    @Insert("INSERT INTO comment(content,created,user_id,weibo_id)" +
            "VALUES(#{content},#{created},#{userId},#{weiboId})")//向数据库上传评论数据
    int insertComment(Comment comment);

    @Delete("DELETE FROM comment WHERE id=#{id}")//删除用户评论
    int deleteComment(Integer id);

    @Update("UPDATE comment SET content=#{content},created=#{created},user_id=#{userId},weibo_id=#{weiboId} WHERE id=#{id}")//更新评论
    int updateComment(Comment comment);

    @Select("SELECT content,user_id userI/*别名*/ FROM comment WHERE id=#{id}")//根据id查询评论
    CommentVO1 selectCommentById(Integer id);

    @Select("SELECT id,created,user_id userId FROM comment WHERE user_id=#{id}")
    List<CommentVO2> selectCommentByUserId(Integer id);
}
