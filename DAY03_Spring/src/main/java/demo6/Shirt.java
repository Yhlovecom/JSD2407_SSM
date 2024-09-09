package demo6;

import org.springframework.stereotype.Component;

@Component
public class Shirt implements Clothes{
    @Override
    public String toString() {
        return "衬衫";
    }
}
