package com.tedu.shopper;

import com.tedu.shopper.mapper.ShopperMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tedu.shopper.pojo.Merchandise;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ShopperApplicationTests {
    @Autowired//自动注入接口ShoppMapper
    private ShopperMapper shopperMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsertShopper() {//测试插入数据到表shopper中
        //1.依照MMerchandise创建一个数据对象
        Merchandise merchandise = new Merchandise();
        //2.设置数据对象的属性值
        merchandise.setName("手机");
        merchandise.setNum("100");
        merchandise.setPrice("1000");
        merchandise.setType("手机");
        //3.调用接口ShopperMapper的方法，完成插入操作
        shopperMapper.insertShopper(merchandise);
    }

    @Test
    void testDeletesShopperById() {//测试批量删除功能
        //1.创建要删除的id集合
        List<Integer> ids = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            ids.add(i);
        }
        //2.调用接口ShopperMapper的方法，完成批量删除操作
        shopperMapper.deletesShopper(ids);
    }
}
