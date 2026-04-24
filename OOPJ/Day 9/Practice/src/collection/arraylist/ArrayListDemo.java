package collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

    public static void display(Collection<?> c) {
        for (Object l : c) {
            System.out.println(l);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();
        strings.add("Navin");
        strings.add("Bhavesh");
        strings.add("Omkar");
        strings.add("Mahendra");
        display(strings);*/

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12, "Navin", 78.65f));
        studentList.add(new Student(15, "Chaudhari", 48.15f));
        studentList.add(new Student(13, "Mahendra", 65.36f));
        studentList.add(new Student(14, "Mihir", 85.2f));
        studentList.add(new Student(15, "Chaudhari", 48.15f));

        System.out.println("Student Using ArrayList: ");
        display(studentList);

        List<Student> list2 = new LinkedList<Student>();
        list2.add(new Student(16, "Omkar", 56.2f));
        list2.add(new Student(17, "Sourabh", 68.2f));
        list2.add(new Student(15, "Chaudhari", 48.15f));
        list2.add(new Student(18, "Vinit", 53.2f));

        List<Student> list3 = new ArrayList<>();
        list3.add(new Student(16, "Omkar", 56.2f));
        list3.add(new Student(17, "Sourabh", 68.2f));

        System.out.println("Student Using ArrayList: ");
        display(list2);

        studentList.addAll(list2);
        display(studentList);

//        System.out.println("Is ArrayList Empty: " + studentList.isEmpty());

//        System.out.println(studentList.contains(new Student(18, "Vinit", 53.2f)));

//        System.out.println(studentList.containsAll(list3));

//        studentList.remove(new Student(18, "Vinit", 53.2f));
//        display(studentList);

        /*System.out.println("List after removing");
        studentList.removeAll(list3);
        display(studentList);*/

/*        System.out.println("List after Retain");
        studentList.retainAll(list3);
        display(studentList);*/

        /*System.out.println("List 2 before clear");
        display(list2);
        list2.clear();
        System.out.println("List 2 After clear");
        display(list2);*/

        System.out.println("Size of list1 : " + studentList.size());
        System.out.println("Size of list2 : " + list2.size());
        System.out.println("Size of list3 : " + list3.size());

        System.out.println("Student array using toArray");
        Student[] s = studentList.toArray(new Student[0]);
        /*for (Student s1 : s) {
            System.out.println(s1);
        }*/

        System.out.println(studentList.get(2));
        System.out.println(studentList.getFirst());
        System.out.println(studentList.getLast());
        System.out.println(studentList.indexOf(new Student(15, "Chaudhari", 48.15f)));
        System.out.println(studentList.lastIndexOf(new Student(15, "Chaudhari", 48.15f)));
        studentList.remove(3);
//        display(studentList);

        System.out.println("set method");
        studentList.set(1,new Student(15, "Chaudhari", 48.15f));
//        display(studentList);

        System.out.println("SubList");
        List<Student> studentList1 = studentList.subList(2, 5);
        display(studentList1);


    }
}
