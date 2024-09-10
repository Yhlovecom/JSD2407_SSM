package com.tedu.day06mybatis.mapper;

import com.tedu.day06mybatis.pojo.Weibo;
import com.tedu.day06mybatis.pojo.WeiboVO1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeiboMapper {
    /*在resources/mappers下定义了WeiboMapper.xml文件，并为该方法配置了要指定的SQL语句，
      因此不用在指定注解*/
    int insert(Weibo weibo);

    int deleteById(Integer id);

    int updateById(Weibo weibo);

    Weibo findById(Integer id);

    List<Weibo> findAll();

    /*
        当检索数据不是全字段时，那么没有检索的字段在返回的对象中对应的属性值为NULL。
        或者再定义一个针对本次查询的类，例如下面的案例
        WeiboVO1中只定义两个属性:content,created，就是针对本次查询仅查看两个字段的情况
        那么这个对象就不存在因为其他字段没有查询，对应属性为NULL的情况了。
     */
//    @Select("SELECT content,created FROM weibo WHERE id=#{id}")
//    Weibo selectContent(int id);
    WeiboVO1 selectContent(int id);

    //动态SQL
    int dynamicUpdate(Weibo weibo);
    /*
        DELETE FROM weibo
        WHERE id IN(1,2,3,4,5)
     */
    int deleteByIds(int[] id);

    int deleteByIds2(List<Integer> id);

}
