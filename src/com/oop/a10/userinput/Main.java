package com.oop.a10.userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class is used to read input from the user. It can be found in the java.util package.
        Scanner scanner = new Scanner(System.in);
        //creating a new person object
        Person person = new Person();
        //asking the user to enter the name
        System.out.println("Enter your name: ");
        //storing String input in the name variable by using .nextLine() method
        person.setName(scanner.nextLine());
        //asking the user to enter the surname
        System.out.println("Enter your surname: ");
        //storing the user input in the surname variable
        person.setSurname(scanner.nextLine());
        //asking the user to enter the age
        System.out.println("Enter your age: ");
        //storing int input in the age variable by using .nextInt() method
        person.setAge(scanner.nextInt());

        //printing the name, surname and age of the person
        System.out.println("Your name is: " + person.getName());
        System.out.println("Your surname is: " + person.getSurname());
        System.out.println("Your age is: " + person.getAge());
        //printing the person by using the toString method
        System.out.println(person);
        //closing the scanner

        System.out.println("");
        scanner.close();
    }
    // there are different methods to read different types of inputs
    /*nextBoolean()	Reads a boolean value from the user
    nextByte()	    Reads a byte value from the user
    nextDouble()	Reads a double value from the user
    nextFloat()	    Reads a float value from the user
    nextInt()	    Reads a int value from the user
    nextLine()	    Reads a String value from the user
    nextLong()	    Reads a long value from the user
    nextShort()	    Reads a short value from the user*/
}
