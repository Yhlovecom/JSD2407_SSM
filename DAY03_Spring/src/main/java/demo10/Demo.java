package demo10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *  Spring提供了一个注解:
 *  @Configuration  被该注解标注的类表示它是一个Spring配置类
 *                  我们可以在该类上定义很多配置信息,用于初始化Spring容器时使用
 *
 *  @ComponentScan  该注解用于告知Spring容器扫描哪个包中的类进行管理
 *                  Spring容器在创建时会将该包以及下面所有子包中的所有被@Component等注解
 *                  标注的类注册为Spring Bean并进行管理
 */
@Configuration
@ComponentScan("demo10")
public class Demo {
    public static void main(String[] args) {
        //创建Spring容器时将配置类传递给容器进行初始化
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Demo.class);

        Person person = context.getBean(Person.class);
        System.out.println(person);

    }
}
