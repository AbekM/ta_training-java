package com.epam.training.Asilbek_Makhmudov.beware_of_dogs.residents.cats;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}
