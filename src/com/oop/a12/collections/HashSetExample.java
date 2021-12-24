package com.oop.a12.collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet is a collection that contains no duplicate elements.
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars); // HashSets do not allow duplicates.
        System.out.println("Size of cars HashSet is: " + cars.size()); // It does not count duplicates.
        cars.remove("BMW");
        // It does not matter how many times you add the same element.
        // If you remove it once, it will not be shown in the HashSet.
        System.out.println(cars);

    }

}
