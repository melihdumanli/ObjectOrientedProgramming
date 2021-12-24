package com.oop.a09.interfacesandenums;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the class
        Bird bird = new Bird();
        bird.countLegs();
        bird.sound();
        bird.color = Color.BLUE;
        System.out.println(bird.color);


        Dog dog = new Dog();
        dog.countLegs();
        dog.sound();
        dog.color = Color.BLACK;
        System.out.println(dog.color);

        //Animal animal = new Animal(); // if you try to create an instance of an interface class, you get an error
    }
}
