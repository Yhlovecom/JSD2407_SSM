package demo6;

import org.springframework.stereotype.Component;

@Component
public class Sweater implements Clothes{
    @Override
    public String toString() {
        return "毛衣";
    }
}
