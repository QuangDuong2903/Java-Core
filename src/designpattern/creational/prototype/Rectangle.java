package designpattern.creational.prototype;

public class Rectangle implements Shape {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rec) {
        this.width = rec.width;
        this.height = rec.height;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle rec) {
            return rec.height == height && rec.width == width;
        }
        return false;
    }
}
