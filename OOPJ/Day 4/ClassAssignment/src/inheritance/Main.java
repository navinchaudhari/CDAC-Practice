package inheritance;

public class Main {

  /*  static void changeData(Parent p) {
        p.name = "Bhavesh";
    }*/

    static void changePrimitiveData(int i) {
        i = 15;
    }

    public static void main(String[] args) {
        Parent c = new Child();
        c.print();
        System.out.println(c.name);


    }
}
