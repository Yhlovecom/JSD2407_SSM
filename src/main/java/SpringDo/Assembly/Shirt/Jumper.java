package SpringDo.Assembly.Shirt;

import org.springframework.stereotype.Component;

@Component("jumper")
public class Jumper implements Shirt{
    //继承接口,重写getName方法
    @Override
    public String getShirName() {
        return "Jumper";
    }
}
