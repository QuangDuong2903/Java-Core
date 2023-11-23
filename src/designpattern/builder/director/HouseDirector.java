package designpattern.builder.director;

import designpattern.builder.builder.HouseBuilder;
import designpattern.builder.product.House;

public class HouseDirector {

    private final HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build() {
        this.builder.area();
        this.builder.floor();
        this.builder.window();
        this.builder.door();
        return this.builder.get();
    }
}
