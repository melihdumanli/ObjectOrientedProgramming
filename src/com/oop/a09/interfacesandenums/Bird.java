package com.oop.a09.interfacesandenums;

public class Bird implements Animal {
    Color color;
    @Override
    public void countLegs() {
        System.out.println("I have 2 legs");
    }

    @Override
    public void sound() {
        System.out.println("I am singing");
    }
}
