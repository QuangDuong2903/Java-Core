package collections.set;

import java.util.*;

public class HashSetExample {

    static class Student {
        private long id;
        private String name;
        private int age;

        public Student(long id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(id);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student student = (Student) obj;
                return this.id == student.id;
                //return this.id == student.id && this.name == student.name && this.age == student.age;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        /**
         *     hashCode() -> get hash value and check if it exists in key map
         *      if false -> insert to a new bucket
         *      if true -> equals() check if value is same with old
         *      if true -> with set: do nothing, with map: override old value
         *      if false -> add new value to linked list
         */

        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"Duong", 20));
        set.add(new Student(1,"Duong2", 20));

//        Map<Long, Student> map = new HashMap<>();
//        map.put(1L, new Student(1,"Duong", 20));
//        map.put(1L, new Student(1,"Duong2", 20));
    }

}
