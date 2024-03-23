package designpattern.structural.composite;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        CompositeBox box = new CompositeBox(List.of(
                new Milk("Vinamilk", 25000),
                new SoftDrink("Coca", 15000),
                new CompositeBox(List.of(
                        new Milk("TH", 10000),
                        new SoftDrink("Sting", 12000)
                ))
        ));
        System.out.println(box.calculatePrice());
    }

}
