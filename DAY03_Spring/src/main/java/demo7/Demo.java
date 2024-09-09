package demo7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring管理对象时:单例或多例
 *
 * 单例模式:Singleton
 * 单例模式设java23中设计模式之一，使用该模式设计的类全局只有一个实例
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo7");
        //Spring默认维护类实例都是采取单例模式
        DBConnect db1 = context.getBean(DBConnect.class);
        System.out.println(db1);

        DBConnect db2 = context.getBean(DBConnect.class);
        System.out.println(db2);
    }
}
