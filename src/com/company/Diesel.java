package com.company;

import com.company.devices.Car;

public class Diesel extends Car
{
    public Diesel(String model, String producer, Integer yearOfProduction, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        super(model, producer, yearOfProduction, color, age, fuel, gearbox, type, value);
    }

    @Override
    public void refuel()
    {
        System.out.println("Zjedziesz ze mną świat jak Ci dwumasa nie siądzie ...");
    }
}
