package demo4;

import org.springframework.stereotype.Component;

/**
 * 毛衣
 */
@Component("winter")
public class Sweater implements Clothes{
    @Override
    public String toString() {
        return "毛衣";
    }
}
