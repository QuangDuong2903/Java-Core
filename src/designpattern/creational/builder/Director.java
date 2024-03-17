package designpattern.creational.builder;

public class Director {

    public void buildBugatti(Builder builder) {
        builder.reset()
                .brand("Bugatti")
                .color("Red")
                .speed(100);
    }

    public void buildLamborghini(Builder builder) {
        builder.reset()
                .brand("Lamborghini")
                .color("Yellow")
                .speed(200);
    }

}
