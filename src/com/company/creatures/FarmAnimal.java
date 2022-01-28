package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile

{
    public FarmAnimal(String species)
    {
        super(species);
    }

    @Override
    public void beEten()
    {
        System.out.println("Tylko spróbuj mnie zjeść wrrr...grrr...");
    }
}
