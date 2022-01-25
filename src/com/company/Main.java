package com.company;

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





    }
}
