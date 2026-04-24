public class WrapperClass {
    public static void main(String[] args) {
        int a = 4;
        Integer i = Integer.valueOf(a);
        Float f = Float.valueOf(78.6f);
        System.out.println(i);
        System.out.println(f);

        String  s = String.valueOf(i);

    }
}
