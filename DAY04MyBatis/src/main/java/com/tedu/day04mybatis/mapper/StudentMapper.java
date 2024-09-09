package com.tedu.day04mybatis.mapper;

import com.tedu.day04mybatis.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO student(name,gender,age) VALUES(#{name},#{gender},#{age})")
    int insert(Student student);

    @Delete("DELETE FROM student WHERE name=#{name}")
    int deleteByName(String name);

    @Update("UPDATE student SET name=#{name},gender=#{gender},age=#{age} WHERE id=#{id}")
    int updateById();
}
