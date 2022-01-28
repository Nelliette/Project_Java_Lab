package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args)
    {

        Animal dog = new Pet("pies");
        dog.name = "Max";
        dog.age = 4;
        System.out.println(dog);
        Animal cat = new Pet("kot");
        cat.name = "Mruczek";
        cat.age = 2;
        System.out.println(cat);

        Double weightBeforeEating = dog.getWeight();
       /* dog.showAnimalInformation();


        dog.feed(1.0);
        dog.feed(2.0); */
        System.out.println("Przytyłem o " + (dog.getWeight() - weightBeforeEating + " kg"));
       /* dog.takeForWalk();
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

        Car mazda = new Car("Sześć","Mazda",2020,"Bordowy",2,"Benzyna","Automatyczna","SUV",2500.00);
        Car mazda2 = new Car("Sześć","Mazda",2015,"Bordowy",7,"Benzyna","Ręczna","Combi",2000.00);




        Human bob = new Human("Bob","Kowalsky",7000.0,"Homo sapiens");
        Human stan = new Human("Stan","Stanowy",5000.0,"Homo sapiens");
        bob.getSalary();
        bob.setSalary(2200.0);
        bob.settypeOfCar(mazda);
        System.out.println(mazda.equals(mazda2));
        System.out.println(mazda==mazda2);
        System.out.println(mazda.hashCode() ==mazda2.hashCode());
        System.out.println(mazda);
        System.out.println(bob);
        System.out.println(dog);
        Phone s8 = new Phone("S8","Samsung",2017,8.6,"A9");
        System.out.println(s8);
        s8.turnOn();
        mazda.turnOn();
        System.out.println(s8);
        stan.pet = dog;
        stan.pet.sell(stan,bob,1500.0);
        System.out.println(bob.firstName+" kupił "+stan.pet+" od "+stan.firstName+" teraz pozostało mu "+bob.cash+" natomiast "+stan.firstName+" ma na koncie :"+stan.cash);
        bob.settypeOfCar(mazda);
        bob.gettypeOfCar().sell(bob,stan,5000.0);
        System.out.println(bob.firstName+" sprzedał  kupującemu "+stan.firstName+" samochód teraz pozostało mu "+bob.cash+" natomiast "+stan.firstName+" ma na koncie :"+stan.cash);
        dog.beEten();
        dog.feed(2.5);
        Animal porky = new FarmAnimal("Porky");
        porky.beEten();



    }
}
