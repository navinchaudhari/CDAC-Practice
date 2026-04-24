package object;

public class ObjectClassMethodDemo {
    public static void main(String[] args) {

        //Hashcode Method
        Demo d1 = new Demo();
        int i1 = d1.hashCode();
        System.out.println("D1 HashCode: " + i1);

        Demo d2 = new Demo();
        int i2 = d2.hashCode();
        System.out.println("D2 HashCode: " + i2);

        //toString Method
        String s1 = d1.toString();
        String s2 = d2.toString();
        System.out.println("d1.toString() : " + s1);
        System.out.println("d2.toString() : " + s2);

        //equals() method
        Demo d3 = d1;
        boolean b1 = d1.equals(d2);
        boolean b2 = d1.equals(d3);

        System.out.println("d1.equals(d2): " + b1);
        System.out.println("d1.equals(d3): " + b2);
        System.out.println("D3 HashCode: " + d3.hashCode());

    }
}
