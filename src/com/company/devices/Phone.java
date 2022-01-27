package com.company.devices;

public class Phone extends Devices
{

    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize, String os)
    {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }
    public  void turnOn()
    {
        System.out.println("Za chwilę telefon się uruchomi.");
    }

    @Override
    public String toString()
    {
        return super.toString();

    }
}
