package string;

class Test {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Java");

        System.out.println(s1 + " " + s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Hello");

        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s1));
        s2 = s3;
        System.out.println(s1.equals(s2));
    }
}
