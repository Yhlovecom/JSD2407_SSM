package SpringDo.demo;

import org.springframework.stereotype.Component;

//创建测试类
@Component("springClassDemo")
public class SpringClassDemo {
    //测试方法（自我介绍）
    public void sayHello() {
        System.out.println("大家好，我是Spring框架的入门案例！");
    }
}
