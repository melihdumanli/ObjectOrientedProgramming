package com.oop.a02.methods;

public class Main {
    //Static methods are accessible without creating an object of the class
    static void printStaticMethod() {
        System.out.println("This is a static method that can be called without creating an object of the class");
    }
    // Public methods are accessible from any other classes in the program
    // To call a public method, we need to create an object of the class
    public void printPublicMethod() {
        System.out.println("This is a public method that can be called by creating an object of the class");
    }
    // This is a method with a parameter.
    // Variable "message" is a parameter of the method
    public void printText(String message) {
        System.out.println(message);
    }
    // Variables a and b are parameters of the method
    static void multiply(int a, int b) {
        System.out.println("Result is : " + a * b);
    }


    public static void main(String[] args) {
        Main main = new Main(); // Creating an object of the class
        main.printPublicMethod(); // Calling a public method
        printStaticMethod(); // Calling a static method
        // x, y are parameters of the multiply method
        int x = 10;
        int y = 20;
        multiply(x, y); // Calling a method with a parameter. Also, we can call a method without creating an object of the class
        // text is a parameter of the printText method. We can call the method by creating an object of the class
        String text = "This is a public method with a parameter";
        main.printText(text); // Calling a method with a parameter
    }
}
