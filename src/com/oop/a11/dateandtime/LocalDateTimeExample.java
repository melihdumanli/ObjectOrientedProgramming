package com.oop.a11.dateandtime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // current date and time
        System.out.println(localDateTime); // prints the current date and time
        System.out.println(localDateTime.getDayOfMonth()); // prints the day of the month
        System.out.println(localDateTime.getMonth()); // prints the month
        System.out.println(localDateTime.getYear()); // prints the year
        System.out.println(localDateTime.getHour()); // prints the hour
        System.out.println(localDateTime.getMinute()); // prints the minute
        System.out.println(localDateTime.getSecond()); // prints the second
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 10, 10, 10, 10); // creating a specified LocalDateTime object
        System.out.println(localDateTime1); // prints the specified date and time
        LocalDateTime localDateTime2 = localDateTime1.plusDays(1); // adding 1 day to the specified date and time
        System.out.println(localDateTime2); // prints the date and time after adding 1 day
        localDateTime2 = localDateTime1.minusDays(1); // subtracting 1 day from the specified date and time
        System.out.println(localDateTime2); // prints the date and time after subtracting 1 day
        localDateTime2 = localDateTime1.plusHours(1); // adding 1 hour to the specified date and time
        System.out.println(localDateTime2); // prints the date and time after adding 1 hour
        localDateTime2 = localDateTime1.minusHours(1); // subtracting 1 hour from the specified date and time
        System.out.println(localDateTime2); // prints the date and time after subtracting 1 hour
        localDateTime2 = localDateTime1.plusMinutes(1); // adding 1 minute to the specified date and time
        System.out.println(localDateTime2); // prints the date and time after adding 1 minute
        localDateTime2 = localDateTime1.minusMinutes(1); // subtracting 1 minute from the specified date and time
        System.out.println(localDateTime2); // prints the date and time after subtracting 1 minute
        localDateTime2 = localDateTime1.plusSeconds(1); // adding 1 second to the specified date and time
        System.out.println(localDateTime2); // prints the date and time after adding 1 second
        localDateTime2 = localDateTime1.minusSeconds(1); // subtracting 1 second from the specified date and time
        System.out.println(localDateTime2); // prints the date and time after subtracting 1 second


    }
}
