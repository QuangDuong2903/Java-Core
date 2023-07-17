package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    static class Key {
        private long value;

        @Override
        public int hashCode() {
            return 5;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }

        public Key(long value) {
            this.value = value;
        }
    }

    static class Student {
        private long id;
        private String name;

        public Student(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // hash map get hashCode() of key and find bucket
        // if bucket empty , put entry
        // if bucket has entry use equals() in key
        // if equal, override old value
        // if not put entry at the end of linked list
        Map<Key, Student> map = new HashMap<>();
        map.put(new Key(1), new Student(1, "Quang Duong"));
        map.put(new Key(2), new Student(2, "Quang Khai"));
    }
}
