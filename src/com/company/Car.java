package com.company;

public class Car
{
    final String model;
    final String producer;
    String color;
    Integer age;
    String fuel;
    String gearbox;
    String type;
    Double value;

    public Car(String model, String producer, Double value)
    {
        this.model = model;
        this.producer = producer;
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

}
