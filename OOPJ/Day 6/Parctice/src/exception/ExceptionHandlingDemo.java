package exception;

public class ExceptionHandlingDemo {
    public static void myFun(){
        anotherFun();
    }

    public static void anotherFun(){
        try{
        int res = 5/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        System.out.println("Program execution start........");

        int arr[] = {5, 45, 67};


        int a = 10;
        int b = 5;
        try {
//            System.exit(1);
//            if (true) return;
            myFun();
            int res = a / b;
            System.out.println(res);
            System.out.println(arr[1]);

        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception caught.....");
//            System.out.println(ae.getMessage());
            ae.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Executed");
        }
        System.out.println("Program execution Completed........");


    }
}
