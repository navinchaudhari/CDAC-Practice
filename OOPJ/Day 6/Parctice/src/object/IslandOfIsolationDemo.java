package object;

public class IslandOfIsolationDemo {
    public static void main(String[] args) {
        First f1 = new First(5);
        Second s1 = new Second(10);

        f1.s = s1;
        s1.f = f1;

        f1 = null;
        //s1 = null;

        Runtime.getRuntime().gc();
    }
}
