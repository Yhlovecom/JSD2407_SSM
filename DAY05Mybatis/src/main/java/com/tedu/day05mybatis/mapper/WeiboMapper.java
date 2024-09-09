package com.tedu.day05mybatis.mapper;
import com.tedu.day05mybatis.pojo.Weibo;
import com.tedu.day05mybatis.pojo.WeiboVO1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WeiboMapper {
    /*
        当检索数据不是全字段时，那么没有检索的字段在返回的对象中对应的属性值为NULL。
        或者再定义一个针对本次查询的类，例如下面的案例
        WeiboVO1中只定义两个属性:content,created，就是针对本次查询仅查看两个字段的情况
        那么这个对象就不存在因为其他字段没有查询，对应属性为NULL的情况了。
     */
    int insert(Weibo weibo);
    int deleteById(int id);//依照Id删除微博
    int updateById(Weibo weibo);//修改微博
    Weibo findById(int id);
    List<Weibo> findAll();
    @Select("SELECT content,created FROM weibo WHERE id=#{id}")
//    Weibo selectContent(int id);
    WeiboVO1 selectContent(int id);
}
