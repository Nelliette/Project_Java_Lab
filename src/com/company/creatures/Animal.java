package com.company.creatures;
import com.company.Salleable;
import com.company.creatures.Human;

public abstract class Animal implements Salleable,Edbile

{

    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private static final Double DEFAULT_DOG_WEIGHT = 13.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;

    final String species;
    public String name;
    private Double weight;
    public Integer age;
    public Boolean alive;

    public Animal(String species)
    {
        this.species = species;
        this.alive = true;
        if (this.species.equals("pies"))
        {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("kot"))
        {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else
        {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }



   public void feed(Double foodWeight)
    {
        if (getWeight()-2<= 0)
        {
            isAlive();
        }
        else
        {
            weight += foodWeight;
            System.out.println("Po jedzeniu moja waga wynosi " + round() + " kg.");
        }
    }
    public void feed()
    {
        weight++;
    }
    void takeForWalk()
    {

        if (getWeight()-2 <= 0)
        {
            isAlive();
        }
        else
        {
            weight-=2;
            System.out.println("Podczas spaceru schudłem i teraz ważę " + round() + " kg.");
        }


    }

    void isAlive()
    {

        alive = false;
        System.out.println("Zwierzę umarło. Nie możesz go już nakarmić ani wyprowadzić");


    }
   public Double getWeight()
    {
        return round();
    }
    void showAnimalInformation()
    {
        System.out.println("Gatunek :"+species);
        System.out.println("Imię :"+name);
        System.out.println("Waga :"+weight);
        System.out.println("Wiek :"+age);
        String isAliveString = alive? "żywe":"martwe";
        System.out.println("Podejście do życia :"+ isAliveString);
    }
    void showAnimalInformationForHuman()
    {
        System.out.println("Zwierze jakie posiada to "+species+" który wabi się "+name+" jego waga wynosi :"+weight+"kg, oraz ma "+age+" lat");
    }
    double round()
    {
        return Math.round(weight * 100.0) / 100.0;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.pet != null)
        {
            if (buyer.getCash()>= price)
            {
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.pet = seller.pet;
                System.out.println("Gratulacje właśnie kupiłeś zwierzę.");
            }

            else
            {
                System.out.println("Niestety nie stać Cie na tego zwierzaka");
            }
        }
        else
        {
            System.out.println("Osoba od której próbujesz kupić zwierzę żadnego nie posiada");
        }
    }

    @Override
    public String toString()
    {
        return "Zwierzak{" +
                "o gatunku ='" + species + '\'' +
                ", Imieniu ='" + name + '\'' +
                ", wadze =" + weight +
                ", wieku =" + age +
                ", alive=" + alive +
                '}';
    }
}
