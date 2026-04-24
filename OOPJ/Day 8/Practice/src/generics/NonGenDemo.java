package generics;

public class NonGenDemo {
    public static void main(String[] args) {
        MyGen d = new MyGen(45);
        Integer ob = (Integer) d.getOb();
        System.out.println(d.getOb());

        MyGen  s1 = new MyGen("Welcome");
        System.out.println(s1.getOb());

        Student s = new Student(12, "Navin");
        System.out.println(s);
        MyGen s2 = new MyGen(s);
//        System.out.println(s2);
        Student obj =(Student) s2.getOb();
        System.out.println(obj);
    }
}
