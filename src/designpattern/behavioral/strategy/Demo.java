package designpattern.behavioral.strategy;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        BigDecimal amount;
        PaymentGateway gateway = new PaymentGateway();
        PayStrategy strategy = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        amount = new BigDecimal(scanner.nextLine());
        System.out.print("1.By PayPal 2. By Credit Card, Enter payment method: ");
        switch(scanner.nextInt()) {
            case 1 -> strategy = new PayByPayPal();
            case 2 -> strategy = new PayByCreditCard();
            default -> System.out.println("Invalid choice");
        }
        gateway.setStrategy(strategy);
        gateway.pay(amount);
    }
}
