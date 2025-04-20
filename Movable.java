package com.dmdev.oop.part4;

public interface Movable {

    void move();

    default void rest(){
        System.out.println("Animal is resting");
    }

}
