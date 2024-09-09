package test;

import org.springframework.stereotype.Component;

@Component
public class Hamburger implements Food{
    @Override
    public String toString() {
        return "汉堡";
    }
}
