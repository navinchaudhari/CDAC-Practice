package collection.set;

import java.util.*;

public class SetStudentDemo {

    static void display(Collection<?> list) {
        System.out.println("--------------------------------------");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("--------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
    /*    Set<String> strings = new HashSet<>();
        strings.add("Navin");
        strings.add("Bhavesh");
        strings.add("Omkar");
        strings.add(null);
        strings.add("Mahendra");
        strings.add("Navin");
        strings.add(null);
        display(strings);*/

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(12, "Navin"));
        studentSet.add(new Student(15, "Chaudhari"));
        studentSet.add(new Student(13, "Mahendra"));
        studentSet.add(new Student(14, "Mihir"));
        studentSet.add(new Student(15, "Chaudhari"));
        display(studentSet);

        Set<Student> list2 = new HashSet<>();
        list2.add(new Student(16, "Omkar"));
        list2.add(new Student(17, "Sourabh"));
        list2.add(new Student(15, "Chaudhari"));
        list2.add(new Student(18, "Vinit"));

        Set<Student> list3 = new HashSet<>();
        list3.add(new Student(16, "Omkar"));
        list3.add(new Student(17, "Sourabh"));

        System.out.println("Student Using Hashset: ");
        display(list2);

        studentSet.addAll(list2);
        display(studentSet);

        System.out.println("Is ArrayList Empty: " + studentSet.isEmpty());

        System.out.println(studentSet.contains(new Student(18, "Vinit")));

        System.out.println(studentSet.containsAll(list3));

//        studentList.remove(new Student(18, "Vinit", 53.2f));
//        display(studentList);

        /*System.out.println("List after removing");
        studentList.removeAll(list3);
        display(studentList);*/

/*        System.out.println("List after Retain");
        studentList.retainAll(list3);
        display(studentList);*/

        System.out.println("List 2 before clear");
        display(list2);
        list2.clear();
        System.out.println("List 2 After clear");
        display(list2);

        System.out.println("Size of list1 : " + studentSet.size());
        System.out.println("Size of list2 : " + list2.size());
        System.out.println("Size of list3 : " + list3.size());

    }
}
