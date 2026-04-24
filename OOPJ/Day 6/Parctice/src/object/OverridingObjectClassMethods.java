package object;

public class OverridingObjectClassMethods {
    public static void main(String[] args) {
        Student s1 = new Student(13, "Navin");
        Student s2 = new Student(46, "Bhavesh");
        Student s3 = new Student(13, "Navin");

        System.out.println(s1);
        System.out.println(s2);

        if (s1.equals(s2)) {
            System.out.println("S1 and S2 are equals");
        } else {
            System.out.println("S1 and S2 are not equals");
        }

        if (s1.equals(s3)) {
            System.out.println("S1 and S3 are equals");
            System.out.println("S1 and S3 HashCodes " + s1.hashCode() + " " + s3.hashCode());

        } else {
            System.out.println("S1 and S3 are not equals");
        }
    }
}
