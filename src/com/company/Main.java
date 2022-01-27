package com.company;

import com.company.devices.Car;

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
       /* dog.showAnimalInformation();


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
        cat.feed(1.0);*/
        Car mazda = new Car("Sześć","Mazda","Bordowy",4,"Benzyna","Automatyczna","SUV",20000.00);
        Car mazda2 = new Car("Sześć","Mazda","Bordowy",4,"Benzyna","Automatyczna","SUV",20000.00);
       // Car mazda3 = new Car("Trzy","Mazda","Bordowy",4,"Benzyna","Automatyczna","SUV",20000.00);


        Human bob = new Human();
        bob.firstName ="Bob";
        bob.lastName = "Kowalsky";
        bob.pet = dog;
        bob.showHumanInformation();
        bob.getSalary();
        bob.setSalary(2200.0);
        bob.settypeOfCar(mazda);
        System.out.println(mazda.equals(mazda2));
        System.out.println(mazda==mazda2);
        System.out.println(mazda.hashCode() ==mazda2.hashCode());
        System.out.println(mazda);
        System.out.println(bob);
        System.out.println(dog);


    }
}
