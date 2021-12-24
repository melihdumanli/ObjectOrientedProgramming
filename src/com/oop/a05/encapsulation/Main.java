package com.oop.a05.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the class
        Person person = new Person();
        //setting parameters of person object
        person.setName("Melih");
        person.setSurname("Dumanlı");
        person.setAge(32);
        //printing the person object
        System.out.println(person.toString());
        //printing the person object with getter methods
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }
}
