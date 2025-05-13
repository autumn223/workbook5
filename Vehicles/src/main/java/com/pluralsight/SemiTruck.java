package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfTrailers;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfTrailers) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.numberOfTrailers = numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void attachTrailer() {
        System.out.println("Trailer attached.");
    }
}
