package com.oop.a11.dateandtime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); //represent current time
        System.out.println("Current time: " + time); // prints current time
        System.out.println("Hour: " + time.getHour()); // prints hour
        System.out.println("Minute: " + time.getMinute()); // prints minute
        System.out.println("Second: " + time.getSecond()); // prints second
        LocalTime time2 = LocalTime.of(12, 30, 20); // create a specified time object
        System.out.println("Time: " + time2); // prints time
        LocalTime time3 = time2.plusHours(2).plusMinutes(30).plusSeconds(20); // add 2 hours, 30 minutes and 20 seconds
        System.out.println("Time: " + time3); // prints time

    }
}
