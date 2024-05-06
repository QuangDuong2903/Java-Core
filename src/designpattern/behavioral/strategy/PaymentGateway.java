package designpattern.behavioral.strategy;

import java.math.BigDecimal;

public class PaymentGateway {

    private PayStrategy strategy;

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    void pay(BigDecimal amount) {
        strategy.pay(amount);
    }
}
