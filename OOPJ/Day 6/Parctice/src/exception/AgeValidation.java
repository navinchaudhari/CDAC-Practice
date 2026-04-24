package exception;

public class AgeValidation extends RuntimeException{
    String s = "Under Age";
    public AgeValidation(String message) {
        super(message);
    }

    public AgeValidation() {
//        System.out.println("Under Age");
    }


}
