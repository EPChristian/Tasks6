package com.dmdev.oop.part4;

abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {

    };

}
