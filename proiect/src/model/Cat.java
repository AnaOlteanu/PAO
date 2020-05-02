package model;

public class Cat{
    private String name;
    private int age;
    private double weight;
    private String type = "cat";

    public Cat(String name, int age, double weight) {
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


    public void eatMenu(){
        double amount;
        amount = (this.getWeight()*100)/this.getAge();
        System.out.println("The cat " + this.getName() + " eats " + amount + " g of food." );
    }
}
