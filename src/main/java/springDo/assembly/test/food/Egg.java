package springDo.assembly.test.food;

import org.springframework.stereotype.Component;
import springDo.assembly.test.food.Food;

@Component//Spring管理注释
public class Egg implements Food {
    //实现食物接口
    private Food food;
    public String getName() {
        return "鸡蛋";
    }
}