package SpringDo.Assembly.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {//学生依赖测试类
    public static void main(String[] args)
    {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("SpringDo.Assembly.test")) {

            // 从容器中获取 Person Bean 创建Student对象
            Student student = context.getBean(Student.class);
            System.out.println(student);
        }
    }
}
