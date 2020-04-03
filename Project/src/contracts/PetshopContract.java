package contracts;

import model.Cat;
import model.Dog;
import model.Employee;


public interface PetshopContract {
    void addDog(Dog d);
    void addCat(Cat c);
    void addEmployee(Employee e);
    void showEmployeesOrderByName();
    void showEmployeesOrderBySalary();
    void removeEmployee(int index);
    void showMenu();
    void showCatsByWeight();
}
