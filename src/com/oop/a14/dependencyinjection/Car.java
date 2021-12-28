package com.oop.a14.dependencyinjection;

public class Car implements Drivable{
    public Car() {
        System.out.println("Car created");
    }

    @Override
    public String start() {
        return "Car started";
    }
}
