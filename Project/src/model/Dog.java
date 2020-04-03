package model;

public abstract class Dog{
    private String name;
    private int age;
    private double weight;

    public abstract void eatMenu();
    public abstract int adoptionGrade();

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

}
