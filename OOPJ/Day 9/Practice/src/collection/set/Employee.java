package collection.set;

import java.util.*;

public class Employee implements Comparable<Employee> {
    String name;
    float salary;

    public Employee() {
    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return (this.name.equals(e.name) && this.salary == e.salary);
    }

    public int hasCode() {
        return Objects.hash(name, salary);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
