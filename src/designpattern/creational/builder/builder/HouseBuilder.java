package designpattern.creational.builder.builder;

import designpattern.creational.builder.product.House;

public interface HouseBuilder {
    void floor();
    void area();
    void door();
    void window();
    House get();
}
