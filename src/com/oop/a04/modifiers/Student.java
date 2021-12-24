package com.oop.a04.modifiers;

//this is a subclass of Person
public class Student extends Person {
    // variables of parent class inherited by child class
    private int graduationYear; // new variables can be added to child classes

    // override method of parent class
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a student");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Melih";
        s.surname = "Dumanlı";
        s.age = 32;
        s.graduationYear = 2013;
        s.sayHello();
        System.out.println(s.name + " " + s.surname + " " + s.age + " " + s.graduationYear);
    }
}
