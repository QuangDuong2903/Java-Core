package designpattern.structural.flyweight;

import java.awt.*;

public class BulletType {
    private final Color color;
    private final String sprite;

    public void draw(Graphics g, int x, int y, int speed) {
        g.setColor(color);
        g.fillOval(x, y, 10, 10);
    }

    public Color getColor() {
        return color;
    }

    public String getSprite() {
        return sprite;
    }

    public BulletType(Color color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }
}
