package com.oop.a12.collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();
        //HashMaps have a key and value. The key is the index and the value is the value of the index.
        students.put(1, "John"); // adding elements to the HashMap
        students.put(2, "Mary");
        students.put(3, "Mike");
        students.put(4, "Peter");
        students.put(5, "Melih");
        System.out.println("The size of the HashMap is: " + students.size());
        System.out.println("The value of the key 2 is: " + students.get(2)); // accessing the value of the key 2
        students.remove(3); // removing the key 3 and the value of the key 3
        System.out.println(students); // HashMaps have default toString method. We can print HashMaps directly.
        students.entrySet().forEach(System.out::println); // printing the HashMap with entrySet method.

    }
}
