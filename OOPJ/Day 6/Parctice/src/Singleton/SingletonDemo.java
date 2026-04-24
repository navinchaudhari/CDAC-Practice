package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        First f1 = First.getInstance();
        First f2 = First.getInstance();

        f1.print();
        f2.print();

        f1.a = 56;

        f1.print();
        f2.print();
    }
}
