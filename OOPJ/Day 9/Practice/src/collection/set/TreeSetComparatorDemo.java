package collection.set;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparatorDemo {
    public static void display(Collection<?> collection) {
        System.out.println("-----------------------------------");
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>(new EmployeeSortOnSalary());
        employees.add(new Employee("Navin", 10000));
        employees.add(new Employee("Bhavesh", 25000));
        employees.add(new Employee("Vinit", 15000));
        employees.add(new Employee("Chaudhari", 12500));
        display(employees);
    }
}
