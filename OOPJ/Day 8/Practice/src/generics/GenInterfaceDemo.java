package generics;

public class GenInterfaceDemo {
    public static void main(String[] args) {
        One<String > one = new One<>("Welcome");
        Object o = one.myFun();
        System.out.println(o);
        one.anotherFun("to CDAC");

        Two two = new Two("Hello");
        String s = two.myFun();
        System.out.println(s);
        two.anotherFun("Bravo");
    }
}
