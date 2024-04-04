package designpattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    static Map<Color, BulletType> map = new HashMap<>();

    public static BulletType getBulletType(Color color, String sprite) {
        if(map.containsKey(color))
            return map.get(color);
        BulletType type = new BulletType(color, sprite);
        map.put(color, type);
        return type;
    }
}
