package designpattern.behavioral.strategy;

import java.math.BigDecimal;

public class PayByPayPal implements PayStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " by pay pal");
    }
}
