package com.company.devices;

public class Car extends Devices
{
    //final String model;
   // final String producer;
    //final Integer yearOfProduction;
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
    public void turnOn()
    {
        System.out.println("Uruchomienie silnika za ...3...2...1 i 1/2...1 i 1/4....1...jeee");
    }

    void showCarInformation()
    {
        System.out.println("Producent posiadanego samochodu to :"+producer+ ", model "+ model+". Szczegółowe dane poniżej :");
        System.out.println("Kolor: " +color);
        System.out.println("Wiek: "+ age);
        System.out.println("Rodzaj paliwa: "+ fuel);
        System.out.println("Rodzaj skrzyni biegów: "+gearbox);
        System.out.println("Typ nadwozia: "+type);

    }

    /*@Override
    public String toString()
    {
        return "Samochód{" +
                "model='" + model + '\'' +
                ", Producent='" + producer + '\'' +
                ", kolor='" + color + '\'' +
                ", wiek=" + age +
                ", rodzaj paliwa='" + fuel + '\'' +
                ", skrzynia biegów='" + gearbox + '\'' +
                ", typ nadwozia='" + type + '\'' +
                ", cena=" + value +
                ", rok produkcji: =" + yearOfProduction +
                '}';
    }*/

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
