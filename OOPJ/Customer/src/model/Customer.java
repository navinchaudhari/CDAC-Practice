package model;

import java.util.Date;

/*email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
Unique ID - email*/
public class Customer {

    String firstName;
    String lastName;
    String email;
    String password;
    double registrationAmount;
    String dob;
    int customerId = 0;

    public Customer() {

    }

    public Customer(String firstName, String lastName, String email, String password, double registrationAmount, String dob) {
        customerId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRegistrationAmount() {
        return registrationAmount;
    }

    public void setRegistrationAmount(double registrationAmount) {
        this.registrationAmount = registrationAmount;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
