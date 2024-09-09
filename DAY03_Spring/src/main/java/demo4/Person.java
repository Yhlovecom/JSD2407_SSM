package demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 依赖关系
 *
 * 当一个类在实现某种功能时，使用了另一个类，那么此时可以说当前类与另一个有依赖关系
 * Spring建议我们将当前类依赖的类都可以定义为属性
 *
 * 那么在创建当前类时Spring会将依赖的类自动装配到该属性上，而这种通过属性将依赖的
 * 对象设置到当前对象的过程称为"依赖注入"
 */
@Component
public class Person {
    /*
        该注解用于定义在属性上，告知Spring该属性需要自动装配
        此时Spring会根据属性类型扫描包中的类，找到合适的类并初始化它
        然后通过该属性为其"注入"对它的依赖
     */
    @Autowired
    /*
        如果Spring在自动装配时发现多个可以装配的类时
        例如:
        当前项目中Clothes接口有两个实现类:Shirt,Sweater
        那么如果没有特别说明，Spring在装配时会抛出异常

        此时我们的做法有两种
        1:避免在Spring中出现可以匹配多个实现类的情况
        2:为依赖这里添加@Qualifier限定依赖的组件
          此时可以为实现类上@Component("summer")指定组件名称
          那么这里依赖时@Qualifier("summer")则可以被自动装配
     */
    @Qualifier("summer")
//    private Shirt shirt;
//    private Sweater sweater;
    private Clothes clothes;//面向接口，人需要衣服，不是具体某种衣服

    @Override
    public String toString() {
        return "Person{" +
                "clothes=" + clothes +
                '}';
    }
}
