package com.oop.a06.inheritence;

public class Car extends Vehicle {
    private String model;

    public Car() {
    }

    public Car(String brand, int modelYear, String model) {
        super(brand, modelYear);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setModelYear(2018);
        car.setModel("X5");
        System.out.println(car);
    }
}
