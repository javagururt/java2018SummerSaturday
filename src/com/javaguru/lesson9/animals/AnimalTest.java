package com.javaguru.lesson9.animals;

import java.util.ArrayList;
import java.util.List;

class AnimalTest {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal firstAnimal = new Dog("Tuzik");
        Animal secondAnimal = new Cat("Adik");
        Animal animal = new Animal("Something") {
            @Override
            public void sound() {
                System.out.println("...");
            }
        };
        animals.add(firstAnimal);
        animals.add(secondAnimal);
        animals.add(animal);
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).sound();
        }
    }
}
