package com.epam.training.Asilbek_Makhmudov.beware_of_dogs.residents.cats;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
