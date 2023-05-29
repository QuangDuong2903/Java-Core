package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // linked hash set maintain insertion order
        Set<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.forEach(System.out::println);
    }
}
