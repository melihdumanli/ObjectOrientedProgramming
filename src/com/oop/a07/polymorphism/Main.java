package com.oop.a07.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.describeYourself();
        dog.describeYourself();
        cat.describeYourself();
    }
}
