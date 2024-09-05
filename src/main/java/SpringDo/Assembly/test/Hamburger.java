package SpringDo.Assembly.test;

import org.springframework.stereotype.Component;

@Component("first")//Spring管理注释
public class Hamburger implements Food{
    //实现食物接口
    private Food food;
    public String getName() {
        return "汉堡";
    }
}
