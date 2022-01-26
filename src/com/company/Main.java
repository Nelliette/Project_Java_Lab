package com.company;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args)
    {

        Animal dog = new Animal("pies");
        dog.name = "Max";
        dog.age = 4;
        System.out.println(dog);
        Animal cat = new Animal("kot");
        cat.name = "Mruczek";
        cat.age = 2;
        System.out.println(cat);

        Double weightBeforeEating = dog.getWeight();
        dog.showAnimalInformation();


        dog.feed(1.0);
        dog.feed(2.0);
        System.out.println("Przytyłem o " + (dog.getWeight() - weightBeforeEating + " kg"));
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed(2.0);


        Double catWeightBeforeEating = cat.getWeight();
        cat.showAnimalInformation();

        cat.feed(1.0);
        cat.feed(2.0);
        System.out.println("Przytyłem o " + (cat.getWeight() - catWeightBeforeEating + " kg"));
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed(1.0);
        Car mazda = new Car("Sześć","Mazda",20.000);
        mazda.age = 2;
        mazda.color = "Bordowy";
        mazda.fuel = "Benzyna";
        mazda.gearbox = "Automat";
        mazda.type = "SUV";



        Human bob = new Human();
        bob.firstName ="Bob";
        bob.lastName = "Kowalsky";
        bob.pet = dog;
        bob.showHumanInformation();

        bob.getSalary();
        bob.setSalary(2.200);
        bob.setTypeOfCar(mazda);
        mazda.showCarInformation();
        //dog.showAnimalInformationForHuman();


    }
}
