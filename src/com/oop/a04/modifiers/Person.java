package com.oop.a04.modifiers;

//this is an abstract class. Abstract classes cannot be instantiated.
public abstract class Person {
    public String name;
    public String surname;
    public int age;
    private int weight; // private fields can only be accessed by the class itself. Subclasses cannot access them.


    public abstract void sayHello();

    protected void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);}
}
