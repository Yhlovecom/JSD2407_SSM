package com.tedu.day04mybatis.mapper;

import com.tedu.day04mybatis.pojo.Weibo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WeiboMapper {
    @Insert("INSERT INTO weibo(content,created,user_id) VALUES(#{content},#{created},#{userId})")
    int insert(Weibo weibo);

    @Delete("DELETE FROM weibo WHERE id=#{id}")
    int deleteById(Integer id);

    /**
     * UPDATE weibo
     * SET content=#{content},created=#{created},user_id=#{userId}
     * WHERE id=#{id}
     *
     */
    @Update("UPDATE weibo SET content=#{content},created=#{created},user_id=#{userId} WHERE id=#{id}")
    int updateById(Weibo weibo);

    /**
     *  SELECT id,content,created,user_id userId
     *  FROM weibo
     *  WHERE id=?
     *
     *  ResultSet rs
     *  if(rs.next()){
     *      Weibo weibo = new Weibo();
     *      weibo.setId(rs.getInt("id"));
     *      weibo.setContent(rs.getString("content"));
     *      ...
     *      return weibo;
     *  }
     *  return null;
     *
     *
     *  注意，Mybatis在查询数据时会使用查询结果集的字段名与返回的对象属性名对照，并将数据
     *  设置到对应属性上，如果查询表中的字段名与对象属性名不一致时，应当为字段去别名，别名
     *  与属性名一致即可。
     *  例如：
     *  weibo表中用户id的字段名为user_id
     *  Weibo类中对应该字段的属性名为userId
     *  此时SELECT语句中user_id可以定义别名userId,那么mybatis就会将查询的user_id值设置到userId中
     *
     */
    @Select("SELECT id,content,created,user_id userId FROM weibo WHERE id=#{id}")
    Weibo findById(Integer id);


    @Select("SELECT id,content,created,user_id userId FROM weibo")
    List<Weibo> findAll();
}
