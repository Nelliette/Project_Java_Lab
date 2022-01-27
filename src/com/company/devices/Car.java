package com.company.devices;

public class Car
{
    final String model;
    final String producer;
    String color;
    Integer age;
    String fuel;
    String gearbox;
    String type;
    public Double value;

    public Car(String model, String producer, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.age = age;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.type = type;
        this.value = value;
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

    @Override
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
                '}';
    }
}
