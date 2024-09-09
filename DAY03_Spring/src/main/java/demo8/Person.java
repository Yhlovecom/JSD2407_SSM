package demo8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    private String name;

    public Person() {
        System.out.println("Person的构造器执行了");
    }

    public String getName() {
        return name;
    }

    @Value("张三")
    public void setName(String name) {
        System.out.println("Person的setName()方法初始化name属性执行了...");
        this.name = name;
    }

    @PostConstruct
    //一旦一个方法被注解@PostConstruct标注,那么Spring在实例化对象后会调用这个方法一次
    public void init(){
        System.out.println("Person的init方法被调用了");
    }

    @PreDestroy
    //Spring在销毁一个对象前会调用该方法(理解为该对象生命周期最后一个被调用的方法,调用后对象会被销毁)
    public void destroy(){
        System.out.println("Person的destroy方法被调用了");
    }
}
