package com.oop.a09.interfacesandenums;

public class Dog implements Animal {
    Color color;
    @Override
    public void countLegs() {
        System.out.println("I have 4 legs");
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
