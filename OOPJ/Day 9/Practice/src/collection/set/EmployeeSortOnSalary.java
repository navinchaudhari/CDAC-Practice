package collection.set;

import java.util.Comparator;

public class EmployeeSortOnSalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.salary - e2.salary);
    }
}
