package com.oop.a01.classesandobjects;

public class Test {
//creating a string variable
    String text = "Hello World";

    public static void main(String[] args) {
        //creating a new object of Test class
        Test test = new Test();
        //printing the text variable
        System.out.println(test.text);
        //accessing the second class and creating a new object of it
        SecondClass secondClass = new SecondClass();
        //printing the x variable of the second class
        System.out.println(secondClass.x);
        //modifying the text variable of the Test class
        test.text = "I am a new string in Test class";
        //printing the text variable of the Test class
        System.out.println(test.text);
        //modifying the x variable of the Second class
        secondClass.x = 50;
        //printing the x variable of the second class
        System.out.println(secondClass.x);
    }
}
