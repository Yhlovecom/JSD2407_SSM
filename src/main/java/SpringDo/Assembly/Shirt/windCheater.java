package SpringDo.Assembly.Shirt;

import org.springframework.stereotype.Component;

@Component("windCheater")
public class windCheater implements Sweater{
    //继承接口,实现gatName方法
    @Override
    public String getSweaterName() {
        return "windCheater";
    }
}
