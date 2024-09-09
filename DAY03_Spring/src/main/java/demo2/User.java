package demo2;

import org.springframework.stereotype.Repository;
/**
 * https://gitee.com/xiloer/jsd2407-teacher-ssm.git
 *
 * 将java类中的 @Repository注解 替换为 @Component注解、@Service注解、@Controller注解 都可以。
 * @Component 该注解用于描述Spring中的Bean，它是一个泛化的概念，仅仅标识容器中的一个组件（Bean），并且可以作用在任何层次，例如Service层、Dao层等，使用时只需将该注解标注在相应的类上即可。
 * @Repository 该注解用于数据访问层（Dao层）的类标识为Spring中的Bean，功能与@Component相同。
 * @Service 该注解通常作用在业务层（Service层），用于将业务层的类标识为Spring中的Bean，其功能与@Component相同。
 * @Controller 该注解通常作用在控制层（如SpringMVC的Controller），用于将控制层的类标识为Spring中的Bean，其功能与@Component相同。
 */
@Repository
public class User {
    public void sayHello(){
        System.out.println("Hello!!!");
    }
}
