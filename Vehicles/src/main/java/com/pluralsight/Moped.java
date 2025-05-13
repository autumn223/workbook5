package com.pluralsight;

public class Moped extends Vehicle{
    private boolean helmetRequired;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean helmetRequired) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.helmetRequired = helmetRequired;
    }

    public void setHelmetRequired(boolean helmetRequired) {
        this.helmetRequired = helmetRequired;
    }

    public boolean isHelmetRequired() {
        return helmetRequired;
    }

    public void ringBell() {
        System.out.println("Ding ding!");
    }
}

