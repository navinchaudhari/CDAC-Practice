public class Main {
    public static void main(String[] args) {

        A a = new A() {
            void display() {

                System.out.println("Hello Java");
            }
        };

        a.display();

    }

}