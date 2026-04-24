package collection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void display(Collection<?> collection) {
        System.out.println("-----------------------------------");
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Navin", 10000));
        employees.add(new Employee("Bhavesh", 25000));
        employees.add(new Employee("Vinit", 15000));
        employees.add(new Employee("Chaudhari", 12500));
        display(employees);

        Set<Employee> employees1 = new HashSet<>();
        employees1.add(new Employee("Omkar", 25630));
        employees1.add(new Employee("Mihir", 78520));
        employees1.add(new Employee("Chaudhari", 36211));
        employees1.add(new Employee("Mahendra", 12456));
        display(employees1);

        employees.addAll(employees1);
        display(employees);
        employees.add(new Employee("Sourabh", 123456));
        display(employees);


    }
}
