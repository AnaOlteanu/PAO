package model;

public class DogRescued extends Dog {
    private boolean injured;

    public DogRescued(String name, int age, double weight, boolean injured) {
        super(name, age, weight);
        this.injured = injured;
    }

    public boolean isInjured() {
        return injured;
    }

    @Override
    public void eatMenu(){
        double amount;
        amount = 1000/this.getWeight();
        int vitamins;
        vitamins = 10/this.getAge();
        System.out.println("The dog " + this.getName() + " eats "+ amount + " g of food and " + vitamins +" vitamins");
    }

    @Override
    public int adoptionGrade() {
        int grade = 0;
        if(this.isInjured()){
            grade = 6;
        }
        else{
            grade = 8;
        }
        return grade;
    }

    @Override
    public String toString() {
        return "DogRescued{" +
                "name=" + getName() + '\'' +
                "age=" + getAge() + '\'' +
                "weight" + getWeight() + '\'' +
                "injured=" + injured +
                '}';
    }
}
