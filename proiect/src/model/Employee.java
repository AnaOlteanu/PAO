package model;

public class Employee implements Comparable<Employee> {
    private String nume;
    private String prenume;
    private String type;
    private int salary;

    public Employee(String nume, String prenume, String type) {
        this.nume = nume;
        this.prenume = prenume;
        this.type = type;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getType() {
        return type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void calculSalary() {
        int salary;
        if(this.getType().equals("ingrijitor caine")) {
            salary = 450;
            this.setSalary(salary);
        }
        else
            if(this.getType().equals("ingrijitor pisica")) {
                salary = 400;
                this.setSalary(salary);
            }
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getNume().compareTo(employee.getNume());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }
}
