package designpattern.behavioral.strategy;

import java.math.BigDecimal;

public class PayByCreditCard implements PayStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " by credit card");
    }
}
