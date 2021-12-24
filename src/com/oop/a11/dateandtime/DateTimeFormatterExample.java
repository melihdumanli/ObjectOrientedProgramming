package com.oop.a11.dateandtime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("After Formatting: " + formattedDateTime);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, MM/dd/yyyy");
        System.out.println("After Formatting: " + now.format(formatter2));

    }
}
