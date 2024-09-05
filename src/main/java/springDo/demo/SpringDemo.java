package springDo.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {//测试Spring功能
    public static void main(String[] args) {
        //通过Spring框架调用测试类
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("springDo.demo")/*记得关闭上下文*/) {
            // 使用SpringDo作为配置源

            // 从容器中获取对象
            SpringClassDemo springClassDemo = context.getBean(SpringClassDemo.class);
            springClassDemo.sayHello();//调用自我介绍方法
        }
    }
}
