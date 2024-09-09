package test;

import org.springframework.stereotype.Component;

@Component("first")
public class Egg implements Food{
    @Override
    public String toString() {
        return "鸡蛋";
    }
}
