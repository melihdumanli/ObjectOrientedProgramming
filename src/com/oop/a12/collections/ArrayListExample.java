package com.oop.a12.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        // 5 is the initial capacity of the arraylist. String is the type of the elements in the arraylist.
        // We can also use the ArrayList<String> arrayList = new ArrayList<String>();
        // We don't need to specify the type of the elements in the arraylist.
        // The compiler will infer the type of the elements in the arraylist.
        // We don't need to specify initial capacity of the arraylist.
        ArrayList<String> names = new ArrayList<String>(5);
        names.add("John");
        names.add("Mary");
        names.add("Peter");
        names.add("Melih");
        System.out.println("The size of the arraylist is: " + names.size());
        System.out.println("All the elements in the arraylist are: " + names);
        //names.add(15); if we try to add an integer to the arraylist, it will give throw an exception.
        names.add(3, "Mike"); // we can add an element to the arraylist at a specific index.
        //names.add(5, "Mike"); // we can't add an element to the arraylist at index of 5.
        // Because initial capacity of the arraylist is 5. And indexes of the arraylist start from 0.
        // So, if we try to add an element to the arraylist at index of 5, it will throw an exception.

        System.out.println("The size of the arraylist is: " + names.size());
        System.out.println("All elements in the arraylist are: " + names); //Array lists have default toString method. So we can print all the elements in the arraylist directly.
        System.out.println("The element at index 2 is: " + names.get(2)); //We can get the element at index 2.
        System.out.println("The index of the element 'Mary' is: " + names.indexOf("Mary")); //We can get the index of the element 'Mary'.
        System.out.println("The last element in the arraylist is: " + names.get(names.size() - 1)); //We can get the last element in the arraylist.
        System.out.println("The first element in the arraylist is: " + names.get(0)); //We can get the first element in the arraylist.
        names.set(0, "John Doe"); //We can set the element at index 0 to 'John Doe'.
        System.out.println("The first element in the arraylist is: " + names.get(0)); //We can get the first element in the arraylist.
        names.remove(0); //We can remove the element at index 0.
        System.out.println("The size of the arraylist is: " + names.size());
        System.out.println("All elements in the arraylist are: " + names);
        names.clear(); //We can clear the arraylist.
        System.out.println("The size of the arraylist is: " + names.size());

        //We created a new arraylist of type Integer with but did not specify initial capacity.
        // This means we can
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6000);
        numbers.add(128545);
        System.out.println("The size of the arraylist is: " + numbers.size());
        System.out.println("All elements in the arraylist are: " + numbers);
        numbers.add(855); // We can add an element to the arraylist without specifying the index. New element will be added to the end of the arraylist.
        System.out.println("The size of the arraylist is: " + numbers.size());
        numbers.set(5,347); // We can set an element at a specific index.
        numbers.remove(3); // We can remove an element at a specific index.
        System.out.println("The size of the arraylist is: " + numbers.size());
        System.out.println("All elements in the arraylist are: " + numbers);

    }
}
