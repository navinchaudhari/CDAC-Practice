package exception;

import java.io.IOException;

public class CheckedUncheckedDemo {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int age = 13;
        try {
            if (age < 18) {
                throw new ArithmeticException("Age Criteria Failed");
            }
            if (age < 18) {
                throw new IOException("Not Eligible to Vote");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Execution Completed");
    }
}
