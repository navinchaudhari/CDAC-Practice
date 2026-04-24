package Interface;

public class SBI implements ATM{
    @Override
    public void checkBalance() {
        System.out.println("SBI: Check Balance");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("SBI: Withdraw Money");

    }

    @Override
    public void depositMoney() {
        System.out.println("SBI: Deposit Money");

    }

    @Override
    public void changePIN() {
        System.out.println("SBI: Pin changed");

    }
}
