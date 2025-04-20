package com.dmdev.oop.part4;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat("Марсель");
        animals[1] = new Dog("Тузик");

        for (Animal a : animals) {
            a.makeSound();
            a.sleep();

            if (a instanceof Movable) {
                ((Movable) a).move();
                ((Movable) a).rest();
            }
        }

        Dog myDog = new Dog("Умка");

        myDog.makeSound("грустно");
        myDog.makeSound("зла");
        myDog.makeSound("радостно");
    }
}
