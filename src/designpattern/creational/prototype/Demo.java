package designpattern.creational.prototype;

public class Demo {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = (Circle) circle1.cloneShape();
        System.out.println(circle1.equals(circle2));
        Rectangle rec1 = new Rectangle(10, 20);
        Rectangle rec2 = (Rectangle) rec1.cloneShape();
        System.out.println(rec1.equals(rec2));
    }
}
