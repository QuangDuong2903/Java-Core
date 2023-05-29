package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
            arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("Array list add: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
            linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("Linked list add: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arrayList.get(random.nextInt(1000000));
        end = System.currentTimeMillis();
        System.out.println("Array list get: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linkedList.get(random.nextInt(1000000));
        end = System.currentTimeMillis();
        System.out.println("linked list get: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arrayList.remove(random.nextInt(1000000));
        end = System.currentTimeMillis();
        System.out.println("Array list remove: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linkedList.remove(random.nextInt(1000000));
        end = System.currentTimeMillis();
        System.out.println("linked list move: " + (end - start));
    }
}
