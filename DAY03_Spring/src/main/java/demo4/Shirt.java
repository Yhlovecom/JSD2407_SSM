package demo4;

import org.springframework.stereotype.Component;

/**
 * T恤衫
 */
@Component("summer")
public class Shirt implements Clothes{
    @Override
    public String toString() {
        return "T恤";
    }
}
