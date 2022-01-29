package com.oop.a15.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    //fake data
    static List<Student> fakeList = Arrays.asList(new Student("Melih","DUMANLI",
            32),
            new Student("Burak","GÜNEŞ",
                    28),
            new Student("Ali","ERGÜL",
                    34),
            new Student("Hamit","MIZRAK",
                    44),
            new Student("Sercan","ÜSTÜN",
                    24));

    public static void main(String[] args) {
        //Student List ordered by age asc
        List<Student> realList = fakeList.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        realList.forEach(System.out::println);

        System.out.println("************************************");

        //Student List ordered by age desc
        List<Student> realList2 = fakeList.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).collect(Collectors.toList());
        realList2.forEach(System.out::println);
        //fakeList.forEach(System.out::println);
    }
}
