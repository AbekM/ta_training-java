package com.epam.training.Asilbek_Makhmudov.beware_of_dogs.house;

import com.epam.training.Asilbek_Makhmudov.beware_of_dogs.residents.cats.Cat;
import com.epam.training.Asilbek_Makhmudov.beware_of_dogs.residents.dogs.Dog;

import java.util.ArrayList;
import java.util.List;

public class House<Object>{


    private List<Object> residents = new ArrayList<>();

    public void enter(Object resident) {

        if (resident.getClass() == Cat.class){
            List <Cat> residents = new ArrayList<>();
        } else if(resident.getClass() == Dog.class){
            List <Dog> residents = new ArrayList<>();
        }
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
