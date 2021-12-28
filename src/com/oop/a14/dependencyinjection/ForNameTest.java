package com.oop.a14.dependencyinjection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Scanner;

public class ForNameTest {
    private final static String PACKAGE = "com.oop.a14.dependencyinjection";
    private static Hashtable<String, String> types;

    public static void main(String[] args) {
        initSourceData();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the class that you want to work with: ");
        String type = input.nextLine();
        input.close();

        String className = PACKAGE.concat(".").concat(ForNameTest.types.get(type.toLowerCase()));

        try {
            Class<?> clazz = Class.forName(className);
            Constructor<?>[] constrctrs = clazz.getConstructors();
            for (Constructor<?> c : constrctrs) {
                System.out.println(clazz.getSimpleName() + " " + c.getName() + " with " + c.getParameterCount() + " parameters");
                if (c.getParameterCount() == 0) {
                    Object obj = c.newInstance();
                    System.out.println(obj.toString());
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void initSourceData() {
        ForNameTest.types = new Hashtable<String, String>();
        ForNameTest.types.put("car", "Car");
        ForNameTest.types.put("tractor", "Tractor");
    }
}
