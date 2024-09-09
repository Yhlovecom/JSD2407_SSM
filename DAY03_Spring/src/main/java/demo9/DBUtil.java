package demo9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
/*
    用来告知Spring容器对应的properties文件在哪里,让其去读取
    在maven项目中:src/main/java中的代码编译后统一放在target/classes中
    同时resources目录下的东西也放在target/classes中
    可以理解为:
    src/main/java
    src/main/resources
    他们是同一个目录,只不过分别存了.java文件和其他文件
    最终编译后内容都统一放在target/classes中,而在maven项目中target/classes就是类加载路径classpath


    @PropertySource("classpath:config.properties")
    注解用于告诉Spring,初始化当前类时,这个类需要一个配置文件,它在类加载路径下,名为config.properties
    Spring会去target/classes下找到该文件并读取
 */
@PropertySource("classpath:config.properties")
public class DBUtil {
    /*
        ${}用于告知Spring引用上面@PropertySource标注的配置文件中的一项信息的值

        @Value("${spring.datasource.url}") 引用spring.datasource.url的值

        对应的就是config.properties中:
        spring.datasource.url=jdbc:mysql://localhost:3306/tedu
     */
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Override
    public String toString() {
        return "DBUtil{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
