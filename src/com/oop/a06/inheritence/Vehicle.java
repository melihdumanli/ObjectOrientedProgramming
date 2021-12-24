package com.oop.a06.inheritence;

public class Vehicle {
    protected String brand;
    protected int modelYear;

    public void honk() {
        System.out.println("Honk!");
    }

    public Vehicle() {
    }

    public Vehicle(String brand, int modelYear) {
        this.brand = brand;
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}

