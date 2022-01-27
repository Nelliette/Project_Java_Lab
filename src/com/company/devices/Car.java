package com.company.devices;
import com.company.Human;
import com.company.Salleable;

public class Car extends Devices implements Salleable
{
    String color;
    Integer age;
    String fuel;
    String gearbox;
    String type;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.age = age;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.type = type;
        this.value = value;
    }
    public void sell(Human seller,Human buyer,Double price)
    {
        if(seller.gettypeOfCar() != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.carBuyer(seller.gettypeOfCar());
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
