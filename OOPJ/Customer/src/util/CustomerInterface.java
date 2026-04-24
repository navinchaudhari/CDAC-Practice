package util;

import model.Customer;
import model.ServicePlans;

public interface CustomerInterface {
//    Customer cutomer = new Customer();

    void signUp(Customer customer);

    void signIn(String email, String password);

    void changePassword(String email, String password);

    void unsubscribe(String email);

    void displayAllCustomers();

    void deleteCustomersServicePlan(int plan);

    void printDetailsOnDOB();

    void printDetailsOnEmail();

    void printDetailsOnServiceLastname();

    default void display(){
        System.out.println("default Method");
    }


}
