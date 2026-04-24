package generics;

public class GenDemo {
    public static void main(String[] args) {
        MyGen1<Integer> d = new MyGen1<Integer>(45);
        System.out.println(d.getOb());

        MyGen1<String>  s1 = new MyGen1("Welcome");
        System.out.println(s1.getOb());

        Student s = new Student(12, "Navin");
        System.out.println(s);
        MyGen1<Student> s2 = new MyGen1<Student>(s);
//        System.out.println(s2);
        Student ob = s2.getOb();
        System.out.println(ob);
    }
}
