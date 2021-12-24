package com.oop.a08.abstraction;

//abstract classes restricted classes that cannot be used to create objects.
//to access
public abstract class Device {
    //abstract classes can have abstract methods and abstract variables.
    public abstract void on();
    // regular methods can be defined in abstract classes.
    public  void off(){
        System.out.println("Device is off");
    }
}
