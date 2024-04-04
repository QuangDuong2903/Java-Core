package designpattern.structural.flyweight;

import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private int speed;
    private BulletType type;

    public void draw(Graphics g) {
        type.draw(g, x, y, speed);
    }

    public Bullet(int x, int y, int speed, BulletType type) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.type = type;
    }
}
