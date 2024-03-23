package designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistryDemo {

    public interface Prototype {
        Prototype cloneObject();
    }

    public class Button implements Prototype {
        private String color;

        public Button(String color) {
            this.color = color;
        }

        public Button(Button button) {
            this.color = button.color;
        }

        @Override
        public Prototype cloneObject() {
            return new Button(this);
        }
    }

    public class PrototypeRegistry {
        private Map<String, Prototype> map = new HashMap<>();
        public void add(String color, Prototype prototype) {
            map.put(color, prototype);
        }

        public Prototype get(String color) {
            return map.get(color).cloneObject();
        }
    }

}
