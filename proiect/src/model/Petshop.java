package model;

import contracts.PetshopContract;

import java.util.*;

public class Petshop implements PetshopContract {
    private String name;
    private String location;
    private List<Dog> dogs = new ArrayList<>();
    private Cat [] cats = new Cat[0];
    private List<Employee> employees = new ArrayList<>();

    public Petshop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Petshop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'';
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public String getCats() {
        return Arrays.toString(cats);
    }

    public Cat[] getCatsArray(){
        return cats;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void addDog(Dog d) {
        dogs.add(d);
    }


    @Override
    public void addCat(Cat c) {
        Cat [] temp = new Cat[this.cats.length + 1];
        System.arraycopy(this.cats,0,temp,0,this.cats.length);
        temp[temp.length - 1] = c;
        this.cats = temp;
    }

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public void showEmployeesOrderByName() {
        Collections.sort(employees,new EmployeeComparator());
        System.out.println(employees);
    }

    @Override
    public void showEmployeesOrderBySalary() {
        for(Employee e : employees){
            e.calculSalary();
        }
        Collections.sort(employees,new EmployeeComparator2());
        System.out.println(employees);
    }

    @Override
    public List<Employee> getEmployeesByName() {
        for(Employee e : employees){
            e.calculSalary();
        }
        Collections.sort(employees,new EmployeeComparator());
        return employees;
    }

    @Override
    public void removeEmployee(int index) {
        this.employees.remove(index);
    }

    @Override
    public void showMenu() {
        for(Dog d: dogs){
            d.eatMenu();
        }
        for(Cat c : cats){
            c.eatMenu();
        }
    }

    @Override
    public void showCatsByWeight() {
        Arrays.sort(cats,new CatComparator());
        System.out.println(Arrays.toString(cats));
    }
}
