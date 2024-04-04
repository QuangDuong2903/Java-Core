package designpattern.structural.flyweight;

import java.awt.*;

public class Demo {

    static int SIZE = 1000;

    public static void main(String[] args) {
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        Game game = new Game();
        for (int i = 0; i < 100000; i++) {
            game.addBullet(random(0, SIZE), random(0, SIZE), 10, Color.BLACK, "sprite");
        }
        game.setSize(SIZE, SIZE);
        game.setVisible(true);

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long consumedMemory = afterMemory - beforeMemory;

        System.out.println("Heap memory consumed: " + consumedMemory + " bytes");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
