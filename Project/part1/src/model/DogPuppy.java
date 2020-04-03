package model;

public class DogPuppy extends Dog {
    private String playful;

    public DogPuppy(String name, int age, double weight, String playful) {
        super(name, age, weight);
        this.playful = playful;
    }

    public String getPlayful() {
        return playful;
    }

    @Override
    public void eatMenu() {
        double amount;
        amount = 2000/this.getWeight();
        int vitamins;
        vitamins = 20/this.getAge();
        System.out.println("The dog " + this.getName() + " eats "+ amount + " g of food and " + vitamins +" vitamins.");
    }

    @Override
    public int adoptionGrade() {
        int grade = 0;
        if(this.getPlayful().equals("very playful")){
            grade = 10;
        }
        else
            if(this.getPlayful().equals("playful")){
                grade = 8;
            }
            else
                if(this.getPlayful().equals("not playful")){
                    grade = 5;
                }

        return grade;
    }

    @Override
    public String toString() {
        return "DogPuppy{" +
                "name=" + getName() + '\'' +
                "age=" + getAge() + '\'' +
                "weight" + getWeight() + '\'' +
                "playful=" + playful +
                '}';
    }
}
