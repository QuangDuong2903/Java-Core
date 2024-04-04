package designpattern.structural.flyweight;

import com.sun.source.tree.Tree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends JFrame {
    private List<Bullet> bullets = new ArrayList<>();

    public void addBullet(int x, int y, int speed, Color color, String sprite) {
        // using flyweight
//        bullets.add(new Bullet(x, y, speed, BulletFactory.getBulletType(color, sprite)));
        // not using flyweight
        bullets.add(new Bullet(x, y, speed, new BulletType(color, sprite)));
    }

    @Override
    public void paint(Graphics graphics) {
        for (Bullet bullet : bullets) {
            bullet.draw(graphics);
        }
    }
}
