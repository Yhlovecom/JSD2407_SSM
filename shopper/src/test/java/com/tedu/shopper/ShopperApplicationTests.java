package com.tedu.shopper;

import com.tedu.shopper.mapper.ShopperMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tedu.shopper.pojo.Merchandise;

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

}
