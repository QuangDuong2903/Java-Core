package collections.set;

import java.util.TreeSet;

public class TreeSetExample {

    static class Student implements Comparable<Student> {
        private long id;
        private String name;
        private int age;

        public Student(long id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            return (int) (this.id - o.id) + this.name.compareTo(o.name) + this.age - o.age;
        }
    }

    public static void main(String[] args) {
        // check duplicate by compare to method
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(1, "Duong", 20));
        set.add(new Student(1, "Duong", 20));
    }
}
