package demo7;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")//单例，不写默认值也是它
@Scope("prototype")//多例，每次获取时都会创建新对象
public class DBConnect {
}
