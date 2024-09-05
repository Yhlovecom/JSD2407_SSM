package SpringDo.Assembly.Shirt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("jumper")
    private Shirt shirt;//添加衣服依赖
    @Autowired
    @Qualifier("windCheater")
    private Sweater sweater;

    @Override
    public String toString() {
        return "Person{shirtName=" + shirt.getShirName() + "\n" +
                "Sweater=" + sweater.getSweaterName()+ "\n" +
                "}";
    }
}

