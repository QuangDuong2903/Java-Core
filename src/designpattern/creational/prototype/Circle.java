package designpattern.creational.prototype;

public class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle circle) {
            return circle.radius == radius;
        }
        return false;
    }
}
