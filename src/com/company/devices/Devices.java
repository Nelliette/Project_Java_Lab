package com.company.devices;

public abstract class Devices
{
    final String model;
    final String producer;
    final Integer yearOfProduction;

    protected Devices(String model, String producer, Integer yearOfProduction)
    {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    abstract void turnOn();

    @Override
    public String toString()
    {
        return "Devices{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
