package demo1;

import org.springframework.stereotype.Component;
/*
    Spring框架提供的一个注解:@Component
    被该注解标注的类才会被Spring框架管理
 */
@Component
public class User {
    public void sayHello(){
        System.out.println("hello!");
    }
}
