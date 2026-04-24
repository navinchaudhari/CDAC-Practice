package inheritance;

public class HidingPrivateStaticDemo {
    public static void main(String[] args) {
        First f = new Second();
        f.oneFun();
    }

}
