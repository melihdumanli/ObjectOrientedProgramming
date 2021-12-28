package com.oop.a14.dependencyinjection;

public class Tractor implements Drivable{
    public Tractor() {
        System.out.println("Tractor created");
    }


    @Override
    public String start() {
        return "Tractor started";
    }
}
