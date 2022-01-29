package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException
    {

        Animal dog = new Pet("pies");
        dog.name = "Max";
        dog.age = 4;
        System.out.println(dog);
        Animal cat = new Pet("kot");
        cat.name = "Mruczek";
        cat.age = 2;

        Double weightBeforeEating = dog.getWeight();
        dog.feed(2.0);
        System.out.println("Przytyłem o " + (dog.getWeight() - weightBeforeEating + " kg"));

        Car mazda = new Electric("Sześć","Mazda",2020,"Bordowy",2,"Elektryk","Automatyczna","SUV",25000.00);
        Car mazda2 = new Diesel("Sześć","Mazda",2015,"Bordowy",7,"Diesel","Ręczna","Combi",32000.00);
        Car mcp1 = new LPG("P1","McLaren",2015,"Granat",7,"LPG","Automatyczna","Coupe",40000.00);

        Human bob = new Human("Bob","Kowalsky",7000.0,"Homo sapiens");
        Human stan = new Human("Stan","Stanowy",5000.0,"Homo sapiens");

        bob.getSalary();
        bob.setSalary(2200.0);
        bob.settypeOfCar(mazda);
        URL url = new URL("https://www.skype.com/pl/");
        Phone s8 = new Phone("S8","Samsung",2017,8.6,"A9");
        s8.turnOn();
        mazda.turnOn();

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
        mazda.refuel();
        mazda2.refuel();
        mcp1.refuel();
        s8.installAnnApp("Zedge");
        s8.installAnnApp("Quick","14.5");
        s8.installAnnApp("Skype","4.2.7","www.google.play.com");
        s8.installAnnApp(s8.appsInstalled);
        s8.installAnnApp(url);






    }
}
