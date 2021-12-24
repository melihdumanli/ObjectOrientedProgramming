package com.oop.a03.constructors;

public class Computer {
    int price;
    String brand;

    //This is a constructor method
    public Computer(int x) {
        price = x;
    }
    //This is a constructor method. You can have as many constructor methods as you want.
    public Computer(int x, String y) {
        price = x;
        brand = y;
    }

    public static void main(String[] args) {

        Computer c1 = new Computer(100);// Create an object of Computer class
        System.out.println(c1.price + "$");

        Computer c2 = new Computer(200, "MSI"); // Create another object of Computer class
        System.out.println(c2.price + "$, " + c2.brand);

    }

}
