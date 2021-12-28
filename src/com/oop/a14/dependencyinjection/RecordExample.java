package com.oop.a14.dependencyinjection;

public class RecordExample {
    private record Name(String first, String last) {};
    private record Address(String street, String city, String state, String zip) {}
    private record Phone(String number) {}

    private record Contact(Name name, Address address, Phone phone) {}

    public static void main(String[] args) {
        Contact contact = new Contact(new Name("John", "Smith"),
                                      new Address("123 Main St", "Anytown", "CA", "90210"),
                                      new Phone("555-1212"));
        System.out.println(contact);
    }
}
