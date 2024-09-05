package springDo.assembly.shirt;

import springDo.assembly.shirt.person.Person;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("springDo.assembly.shirt")/*记得关闭上下文*/) {
            // 使用 Demo.class 作为配置源

            // 从容器中获取 Person Bean
            Person person = context.getBean(Person.class);
            System.out.println(person);
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }
    }
}
