package com.dmdev.oop.part4;

public class Dog extends Animal implements Movable{

        public Dog(String name) {
            super(name); // Вызов конструктора родителя
        }

    @Override
        public void makeSound() {
            System.out.println(name + " лает");
        }
        public void makeSound(String mood) {
            if (mood.equals("грустно")) {
                System.out.println(name + " скулит");
            } else if (mood.equals("зла")) {
                System.out.println(name + " рычит");
            } else {
                System.out.println(name + " лает");
            }
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
