package com.dmdev.oop.part4;

public class Cat extends Animal implements Movable{

    public Cat(String name) {
        super(name); // Вызов конструктора родителя
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает");
    }

    public void sleep(){
        System.out.println(name + " спит");

    }

    @Override
    public void move() {
        System.out.println(name + " бежит");
    }

    public void rest(){
        System.out.println(name + " отдыхает");
    }

}
