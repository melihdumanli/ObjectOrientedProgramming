package com.oop.a12.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack collection type is a LIFO (Last In First Out). This means that the last element added to the stack is the first element to be removed.
        Stack<String> names = new Stack<>();
        names.push("Adam");
        names.push("Eve");
        names.push("Jack");
        names.push("John");

        System.out.println("Names: " + names); // in this case, you can print all the elements in the stack
        System.out.println("Names: " + names.get(2)); // in this case, you can print the element at index 2
        System.out.println("Names: " + names.peek()); // in this case, you can print the top element of the stack

        //actions on the stack
        names.pop(); // removes the top element of the stack
        names.push("Mary"); // adds a new element to the top of the stack
        names.peek(); // justt looking at the top element of the stack but doing nothing.
        System.out.println("Names: " + names);
        // you can add or remove elements from the stack
        names.remove(0); // removes the element at index 0
        names.add(2, "Melih"); // adds a new element at index 2
        System.out.println("Names: " + names);
    }
}
