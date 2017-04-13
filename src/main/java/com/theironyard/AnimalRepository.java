package com.theironyard;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rickiecashwell on 4/12/17.
 */
@Component
public class AnimalRepository {
    private List<Animal> animals= Arrays.asList(
           new Animal(1,"Bob","dog", "Husky","odd dog" ),
           new Animal(2, "Sally", "dog", "Labrador","another dog"),
            new Animal(3, "Dave", "dog", "Husky","yet another dog"));

    public Animal findAnimalByName(String name){
        for(int i =0; i <= animals.size();i++){
            if(animals.get(i).getName().equals(name)){
                return animals.get(i);
            }
        }
    return null;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
}
