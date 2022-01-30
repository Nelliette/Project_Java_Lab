package com.company.devices;
import com.company.creatures.Human;
import com.company.Salleable;

import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Devices implements Salleable
{
    String color;
    Integer age;
    String fuel;
    String gearbox;
    String type;
    public Double value;
    public List <Human> historyOfCar;

    public Car(String model, String producer, Integer yearOfProduction, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.age = age;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.type = type;
        this.value = value;
        this.historyOfCar = new LinkedList<>();
    }
    private boolean thatWasMyLastCar(Human seller)
    {
        return historyOfCar.get(historyOfCar.size()-1).equals(seller);
    }
    public void sell(Human seller,Human buyer,Double price)
    {
        if(seller.iHaveThisOne(this))
        {
            System.out.println("Chcę sprzedać ten samochód");
            if (!buyer.doIhaveSpaceForCar())
            {
                System.out.println("Nie da rady kupić auta ... nie zmieści sie ;(");
            }
            else if(!this.thatWasMyLastCar(seller))
            {
                System.out.println("To nie jest auto tego właściciela !!!!! ");
            }
            else if (buyer.getCash() >= price)
            {
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.carBuyer(seller.getTypeOfCar());
                seller.carSeller(null);
                System.out.println("Właśnie kupiłeś samochód.");
            }
            else
            {
                System.out.println("Nie posiadasz wystarczającej kwoty na kupno tego auta.");
            }
        }
        else
        {
            System.out.println("Sprzedajacy nie posiada żadnego pojazdu na własność.");
        }
    }
    public void turnOn()
    {
        System.out.println("Uruchomienie silnika za ...3...2...1 i 1/2...1 i 1/4....1...jeee");
    }

  public abstract void refuel();




    @Override
    public String toString()
    {
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", fuel='" + fuel + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
