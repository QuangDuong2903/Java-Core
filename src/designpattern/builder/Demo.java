package designpattern.builder;

import designpattern.builder.concreate.BungalowBuilder;
import designpattern.builder.director.HouseDirector;
import designpattern.builder.product.Book;
import designpattern.builder.product.House;

public class Demo {

    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new BungalowBuilder());
        House house = director.build();
        System.out.println(house);
        director = new HouseDirector(new BungalowBuilder());
        house = director.build();
        System.out.println(house);
        Book book = new Book.Builder()
                .name("book 1")
                .author("author 1")
                .build();
        System.out.println(book);
        book = new Book.Builder()
                .name("book 2")
                .author("author 2")
                .build();
        System.out.println(book);
    }
}
