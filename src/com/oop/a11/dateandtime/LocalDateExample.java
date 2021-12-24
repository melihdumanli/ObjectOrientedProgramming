package com.oop.a11.dateandtime;

public class LocalDateExample {
    public static void main(String[] args) {
        //There are different ways to create a Date object.
        java.time.LocalDate date1 = java.time.LocalDate.now(); // represents the current date (year, month, day) (yyyy-MM-dd)
        System.out.println(date1); // prints the current date
        date1 = java.time.LocalDate.of(2020, 5, 12); // creates a date object with the given year, month and day
        System.out.println(date1); // prints the date
        date1 = java.time.LocalDate.of(2019, 4, 2).plusDays(10); // adds 10 days to the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(2005, 3, 18).minusDays(8); // subtracts 4 days from the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(1990, 2, 5).plusWeeks(10); // adds 1 week to the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(2015, 1, 13).minusWeeks(4); // subtracts 4 weeks from the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(2019, 12, 17).plusMonths(2); // adds 2 months to the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(2020, 1, 22).minusMonths(1); // subtracts 1 month from the date
        System.out.println(date1);
        date1 = java.time.LocalDate.of(2019, 12, 30).plusYears(2); // adds 2 years to the date

    }
}
