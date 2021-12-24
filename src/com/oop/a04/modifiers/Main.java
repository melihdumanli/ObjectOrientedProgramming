package com.oop.a04.modifiers;

public class Main {
    private String name; // private variables and methods are only accessible within the class
    protected String surname; // protected variables and methods are accessible within the package and subclasses
    public int age; // public variables and methods are accessible everywhere
    String gender; // If you don't specify access modifier, variables and methods are accessible in the same package
    final int SALARY = 1000; // If you declare attributes as final, overriding an attribute is not allowed.
    final double PI = 3.14;

    public static void main(String[] args) {
        Main main = new Main();
        main.name = "Melih";
        main.surname = "Dumanlı";
        main.age = 32;
        main.gender = "male";
        //person.PI = 5.55;
        //person.SALARY = 5000; // Overriding finall attributes are not allowed.
        // If you try to change the attributes of final variables, you will get errors.
        System.out.println("Name: " + main.name);
        System.out.println("Surname: " + main.surname);
        System.out.println("Age: " + main.age);
        System.out.println("Gender: " + main.gender);
        System.out.println("PI: " + main.PI);
        System.out.println("Salary: " + main.SALARY);
    }
}
