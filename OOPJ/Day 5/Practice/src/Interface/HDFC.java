package Interface;

public class HDFC implements ATM{
    @Override
    public void checkBalance() {
        System.out.println("HDFC: Check Balance");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("HDFC: Withdraw Money");

    }

    @Override
    public void depositMoney() {
        System.out.println("HDFC: Deposit Money");

    }

    @Override
    public void changePIN() {
        System.out.println("HDFC: Pin Changed");

    }
}
