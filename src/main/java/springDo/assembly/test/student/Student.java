package springDo.assembly.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDo.assembly.test.food.Food;

@Component//注解，标识为被Spring管理
public class Student {//依赖食物的学生

    @Autowired//Spring自动装配，将food注入到Student中
    @Qualifier("first")//设定限定组件
    // 单例模式
    Food food;//组装食物依赖

    //重写toString方法
    @Override
    public String toString()
    {
        return "Student{" + "food=" + food.getName() + "\n" +
                "foodPath=" + food + '}';
    }
}
