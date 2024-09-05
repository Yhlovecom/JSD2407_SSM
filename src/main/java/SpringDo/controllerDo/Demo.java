package SpringDo.controllerDo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {//简单的mvc架构演示
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("SpringDo.controllerDo")){
        }
    }
}
