package springDo.SpringDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;//引用Spring框架
import springDo.SpringDAO.dao.UserDAO;

public class Demo {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("springDo.SpringDAO");//配置类

        UserDAO userDAO1 = context.getBean(UserDAO.class);//获取对象

        System.out.println(userDAO);
        System.out.println(userDAO1);
    }
}
