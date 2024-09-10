package com.tedu.shopper.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.tedu.shopper.pojo.Merchandise;

import java.util.List;

@Mapper
public interface ShopperMapper {
    int insertShopper(Merchandise merchandise);//插入商品

    int updateShopper(Merchandise merchandise);//更新商品

    int deletesShopper(List<Integer> ids);
}
