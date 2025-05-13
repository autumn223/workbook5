package com.pluralsight;

public class Car extends Vehicle{
    private int trunkSize;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int trunkSize) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.trunkSize = trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    public int getTrunkSize() {
        return trunkSize;
    }

    public void honkHorn() {
        System.out.println("Beep beep!");
    }
}


