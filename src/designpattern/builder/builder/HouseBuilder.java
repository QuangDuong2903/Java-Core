package designpattern.builder.builder;

import designpattern.builder.product.House;

public interface HouseBuilder {
    void floor();
    void area();
    void door();
    void window();
    House get();
}
