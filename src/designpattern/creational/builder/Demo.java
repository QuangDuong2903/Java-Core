package designpattern.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.buildBugatti(carBuilder);
        Car car = carBuilder.build();
        director.buildBugatti(manualBuilder);
        CarManual manual = manualBuilder.build();
        System.out.println(car + " " + manual);

        director.buildLamborghini(carBuilder);
        car = carBuilder.build();
        director.buildLamborghini(manualBuilder);
        manual = manualBuilder.build();
        System.out.println(car + " " + manual);

    }
}
