package com.tedu.egmybatis1.mapper;

import com.tedu.egmybatis1.pojo.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert("INSERT INTO product(title,price,stock) VALUES(#{title},#{price},#{stock})")
    int insertProduct(Product record);

    @Select("SELECT id,title,price,stock FROM product WHERE id=#{id}")
    Product selectProductById(int id);

    @Delete("DELETE FROM product WHERE id=#{id}")
    int deleteProductById(int id);

    @Select("SELECT id,title,price,stock FROM product")
    List<Product> selectAllProduct();


}
