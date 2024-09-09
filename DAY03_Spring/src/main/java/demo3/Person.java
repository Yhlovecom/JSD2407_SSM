package demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring也可以通过属性的set方法对属性初始化
 */
@Component
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    //在属性对应的set方法上使用@Value注解一样可以为该属性初始化
    @Value("范传奇")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("22")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
