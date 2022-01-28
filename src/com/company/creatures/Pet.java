package com.company.creatures;

public class Pet extends Animal
{
    public Pet(String species)
    {
        super(species);
    }

    @Override
    public void beEten()
    {
        System.out.println("Jestem niezjadalny !!!!");
    }
}
