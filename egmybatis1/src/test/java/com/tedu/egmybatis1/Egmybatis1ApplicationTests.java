package com.tedu.egmybatis1;

import com.tedu.egmybatis1.mapper.ProductMapper;
import com.tedu.egmybatis1.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybatis1ApplicationTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void testInsertProduct() {
        Product product = new Product();
        product.setTitle("月饼");
        product.setPrice(30);
        product.setStock(1000);
        int num = productMapper.insertProduct(product);
        System.out.println(num>0?"插入成功":"插入失败");
    }

}




