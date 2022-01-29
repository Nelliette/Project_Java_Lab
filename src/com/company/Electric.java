package com.company;

import com.company.devices.Car;

public class Electric extends Car
{
    public Electric(String model, String producer, Integer yearOfProduction, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        super(model, producer, yearOfProduction, color, age, fuel, gearbox, type, value);
    }

    @Override
    public void refuel()
    {
        System.out.println("Jestem idealny jeśli nie przeszkadzają Ci częste , długie przerwy");
    }
}
