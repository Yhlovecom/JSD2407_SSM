package demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用Spring容器来管理项目中要使用的所有类
 * 我们将创建，初始化类等操作的控制权转交给Spring容器来管理被称为"控制反转 IOC(Inverse Of Control)"
 */
public class Demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        //曾经的我们:
        User user = new User();//缺点:写死了，换个别的类或实现就要改代码。。。
        user.sayHello();


        //前段时间的我们:学会了反射
        Class cls = Class.forName("demo1.User");//好处:换类时程序不改了
        User obj = (User)cls.newInstance();//缺点:写一堆反射代码
        obj.sayHello();

        //如今的我们:Spring 一个叫春天的框架，让我们沐浴在春天中
        //Spring框架提供的核心类，用于管理项目中的类
        //指定让Spring框架扫描的包，框架便会扫描该包下的所有类以及这个包下所有子包中的类
        AnnotationConfigApplicationContext context
                =new AnnotationConfigApplicationContext("demo1");
        User user2 = context.getBean(User.class);
        user2.sayHello();

    }
}







