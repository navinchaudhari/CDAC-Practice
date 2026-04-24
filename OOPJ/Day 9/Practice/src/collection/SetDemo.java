package collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student s1 = new Student(12, "Navin");
        students.add(s1);
        students.add(new Student(13, "Bhavesh"));
        students.add(new Student(15, "Mahendra"));
        students.add(new Student(17, "Omkar"));
        students.add(new Student(19, "Sourabh"));
        for (Student s : students) {
            System.out.println(s);
        }

        Iterator<Student> it = students.iterator();
        System.out.println();
        System.out.println("Using Iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
