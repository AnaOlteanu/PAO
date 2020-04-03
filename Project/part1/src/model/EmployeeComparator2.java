package model;

import java.util.Comparator;

public class EmployeeComparator2 implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.getSalary() - e1.getSalary();
    }
}
