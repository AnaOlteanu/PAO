import model.*;

import java.util.Scanner;

/**
 * La un pet shop se afla mai multi caini , care pot fi pui sau pot fi salvati de de pe strazi.
 * De asemenea, se mai pot gasi si pisici la acest pet shop.
 * Aici lucreaza angajati care se ocupa de ingrijirea animalutelor.
 */


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numele petshop-ului: ");
        String numePS = scanner.nextLine();
        System.out.println("Dati locatia pet-shop-ului: ");
        String locatiePS = scanner.nextLine();
        Petshop petshop = new Petshop(numePS,locatiePS);
        System.out.println("Petshop-ul " + petshop.getName() + " este deschis pentru toti in orasul " + petshop.getLocation() + "!");

        System.out.println("Selectati o optiune pentru a afla mai multe detalii:");
        System.out.println("0.Exit");
        System.out.println("1.Arata lista de animale.");
        System.out.println("2.Adauga un caine.");
        System.out.println("3.Adauga o pisica.");
        System.out.println("4.Adauga angajat.");
        System.out.println("5.Arata lista angajati.");
        System.out.println("6.Arata angajati sortati alfabetic.");
        System.out.println("7.Arata angajati sortati dupa salariu.");
        System.out.println("8.Sterge angajat.");
        System.out.println("9.Arata caini predispusi la adoptie.");
        System.out.println("10.Arata meniul animalelor.");
        System.out.println("11.Arata lista pisici ordonate.");

        while (true) {
            String optiune = scanner.next();
            switch (optiune){
                case "0":
                    System.exit(0);
                    break;
                case "1": {
                    System.out.println("Lista de catei este:");
                    System.out.println(petshop.getDogs());
                    System.out.println("Lista de pisici este:");
                    System.out.println(petshop.getCats());
                    System.out.println("Dati optiune:");
                    break;
                }
                case "2": {
                    System.out.println("Dati tip caine: salvat/pui");
                    String tip = scanner.next();
                    if (tip.equals("salvat")) {
                        System.out.println("Dati nume, varsta, greutate si spuneti daca este ranit(true/false):");
                        String nume = scanner.next();
                        int varsta = scanner.nextInt();
                        double greutate = scanner.nextDouble();
                        boolean ranit = scanner.nextBoolean();
                        DogRescued d = new DogRescued(nume, varsta, greutate, ranit);
                        petshop.addDog(d);
                    }
                    else
                        if(tip.equals("pui")){
                            System.out.println("Dati nume, varsta, greutate si spuneti cat de jucaus este(not playful/playful/very playful):");
                            String nume = scanner.next();
                            int varsta = scanner.nextInt();
                            double greutate = scanner.nextDouble();
                            scanner.nextLine();
                            String jucaus = scanner.nextLine();
                            DogPuppy d = new DogPuppy(nume, varsta, greutate, jucaus);
                            petshop.addDog(d);
                        }
                    System.out.println("Dati optiune:");
                    break;
                }
                case "3":{
                    System.out.println("Dati nume, varsta, greutate:");
                    String nume = scanner.next();
                    int varsta = scanner.nextInt();
                    double greutate = scanner.nextDouble();
                    Cat c = new Cat(nume,varsta,greutate);
                    petshop.addCat(c);
                    System.out.println("Dati optiune:");
                    break;
                }

                case "4":{
                    System.out.println("Dati nume, prenume si tip(ingrijitor caine/ ingrijitor pisica):");
                    String nume = scanner.next();
                    String prenume = scanner.next();
                    scanner.nextLine();
                    String tip = scanner.nextLine();
                    Employee e = new Employee(nume,prenume,tip);
                    petshop.addEmployee(e);
                    System.out.println("Dati optiune:");
                    break;
                }
                case "5":{
                    System.out.println("Angajatii sunt:");
                    System.out.println(petshop.getEmployees());
                    System.out.println("Dati optiune:");
                    break;
                }
                case "6":{
                    System.out.println("Angajati sortati alfabetic:");
                    petshop.showEmployeesOrderByName();
                    System.out.println("Dati optiune:");
                    break;
                }
                case "7":{
                    System.out.println("Angajati sortati dupa salariu:");
                    petshop.showEmployeesOrderBySalary();
                    System.out.println("Dati optiune:");
                    break;

                }
                case "8":{
                    System.out.println("Lista angajati:");
                    System.out.println(petshop.getEmployees());
                    System.out.println("Stergeti angajat dupa index:");
                    int index = scanner.nextInt();
                    index -= 1;
                    petshop.removeEmployee(index);
                    System.out.println(petshop.getEmployees());
                    System.out.println("Dati optiune:");
                    break;
                }
                case "9":{
                    System.out.println("Cainii predispusi la adoptie: ");
                    for(Dog d : petshop.getDogs()){
                        if(d.adoptionGrade() > 7){
                            System.out.println(d);
                        }
                    }
                    System.out.println("Dati optiune:");
                    break;
                }
                case "10":{
                    System.out.println("Meniuri:");
                    petshop.showMenu();
                    System.out.println("Dati optiune:");
                    break;
                }
                case "11":{
                    System.out.println("Lista pisici ordonate:");
                    petshop.showCatsByWeight();
                    System.out.println("Dati optiune:");
                    break;
                }

            }
        }



    }
}
