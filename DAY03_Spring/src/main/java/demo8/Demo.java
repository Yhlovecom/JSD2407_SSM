package demo8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试Spring管理的对象生命周期
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("demo8");
        /*
            当我们第一次向Spring索取一个对象时,该对象被初始化,此时该对象对应方法的执行顺序:
            1:构造器执行
            2:注入属性,注入依赖,此时对应属性的set方法会被调用
            3:调用被@PostConstruct注解标注的方法(对象初始化后调用该方法,通知你该对象初始化完毕)
            4:Spring返回该对象给调用方
            5:当容器关闭时,Spring会销毁所有管理的对象,此时会调用对应的
              @PreDestroy标注的方法,通知该对象即将被销毁.
         */
        Person person = context.getBean(Person.class);
        /*
            补充小知识:
            finalize()是在Object中定义的一个方法,当GC发现一个对象没有引用时,会释放该对象
            那么释放前会调用一次该方法,这个方法调用后对象被释放.这意味着该方法是一个对象生命
            周期中真正的最后一个方法.注意,该方法若实现,不能用耗时的操作,因为该方法被gc调用
            耗时会影响gc工作!!
         */
//        person.finalize();//这里只是示意每个对象都有该方法,我们永远不会调用它,只有gc会调用一次
        System.out.println("Spring返回了Person,可以使用该对象了");

        context.close();//关闭Spring容器,Spring会销毁所有管理的对象
    }
}







