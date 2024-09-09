package demo6;

import org.springframework.stereotype.Component;

//@Resource不是Spring框架提供的注解，是JAVA提供的注解
import javax.annotation.Resource;

@Component
public class Person {
/*
       Resource: 依赖注入注解,注入对象或者接口类型的数据;
       装配机制：
           1.根据IoC容器中,Spring Bean对象的名称进行装配[name参数];
           2.未指定名称[name参数],把属性名作为Bean对象名称进行装配;
           3.属性名和Bean对象名称也不一致,则根据类型进行装配;
       Autowired注解和Resource注解的区别?
           1.Autowired是Spring Framework注解,Resource是JDK的标准注解;
           2.装配机制不同
             2.1 Autowired注解根据类型进行装配;
             2.2 Resource注解
                 * 根据Bean对象名称进行装配;
                 * 未指定名称,则使用属性名作为名称进行装配;
                 * 属性名和Bean对象名称也不一致,则根据类型进行装配;
                 * 根据类型装配失败,抛出异常:NoUniqueBeanDefinitionException;
    */
//    @Resource
//  private Clothes clothes;

//    @Resource(name="sweater")//类名注意，首字母小写，其余与类名完全一致即可
//    private Clothes clothes;

    @Resource
    private Clothes shirt;//还可以根据属性名装配，与类名一致(除了首字母小写)

    @Override
    public String toString() {
        return "Person{" +
                "clothes=" + shirt +
                '}';
    }
}
