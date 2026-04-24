package exception;

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program Execution Started");
        int age = 15;
        try {
        if (age<18) {
            throw new AgeValidation("Below 18 Grow up baby");
        }
        }catch (AgeValidation a){
//            System.out.println(a.getMessage());
            a.printStackTrace();
        }

        System.out.println("Program Execution Completed");
    }
}
