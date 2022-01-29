package com.company;

import com.company.devices.Car;

public class LPG extends Car
{
    public LPG(String model, String producer, Integer yearOfProduction, String color, Integer age, String fuel, String gearbox, String type, Double value)
    {
        super(model, producer, yearOfProduction, color, age, fuel, gearbox, type, value);
    }

    @Override
    public void refuel()
    {
        System.out.println("Jestem tani więc jeśli nie boisz się wybuchowych akcji będzie super :)");
    }
}
