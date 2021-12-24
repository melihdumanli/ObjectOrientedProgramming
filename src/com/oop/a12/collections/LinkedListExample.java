package com.oop.a12.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //LinkedList is a collection that maintains insertion order.
        LinkedList<String> cars = new LinkedList<>(); //creating a linked list of strings
        cars.add("Volvo"); //adding elements to the linked list
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("The element at index 1 is: " + cars.get(1));
        cars.add(1, "Toyota"); //adding element at a particular index
        System.out.println(cars);
        System.out.println("The element at index 1 is: " + cars.get(1));
        //as you can see, if we add a new element to a specific index, all the elements after that index will be shifted by one
        cars.remove(2); //removing an element from the linked list
        cars.addFirst("Honda"); //adding an element at the beginning of the linked list
        cars.addLast("Hyundai"); //adding an element at the end of the linked list
        System.out.println(cars);
    }
}
