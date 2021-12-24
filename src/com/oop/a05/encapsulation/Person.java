package com.oop.a05.encapsulation;

public class Person {
    private String name;
    private String surname;
    private int age;

    // no args constructor
    public Person(){
    }
    // all args constructor
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // toString method
    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age;
    }
}
