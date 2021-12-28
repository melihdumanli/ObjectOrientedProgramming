package com.oop.a13.reflection;

import java.lang.reflect.Method;

public class EncapsulationTest {
    public static void main(String[] args) {
        Method[] methods = Person.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("The methods of class named " + Person.class.getSimpleName() + "are :" + method.toString());
        }


    }
}
