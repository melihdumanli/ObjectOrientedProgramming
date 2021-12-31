package com.oop.a15.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        String[] cities = {"New York", "London", "Paris", "Berlin", "Madrid", "Rome", "Barcelona", "Amsterdam", "Prague", "Vienna", "Warsaw", "Budapest", "Helsinki", "Copenhagen", "Stockholm", "Oslo", "Athens", "Sofia", "Vilnius", "Lisbon", "Bucharest", "Moscow", "Belgrade", "Bratislava"};

        List<String> cityList = Arrays.asList(cities);
        // 1.) for each
        cityList.stream().forEach(System.out::println);
        System.out.println("**********************************************************");

        // 2.) sorting and collecting
        List<String> sortedCityList = cityList.stream().sorted().collect(Collectors.toList());
        sortedCityList.forEach(System.out::println);
        System.out.println("**********************************************************");

        // 3.) limit
        List<String> limitedCityList = cityList.stream().sorted().limit(5).collect(Collectors.toList());
        limitedCityList.forEach(System.out::println);
        System.out.println("**********************************************************");

        // 4.) filter
        List<String> filteredCityList = cityList.stream().filter(city -> city.length() > 7).sorted().collect(Collectors.toList());
        filteredCityList.forEach(System.out::println);

    }
}