package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int hoverHeight;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int hoverHeight) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.hoverHeight = hoverHeight;
    }

    public void setHoverHeight(int hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    public int getHoverHeight() {
        return hoverHeight;
    }

    public void glide() {
        System.out.println("Hovering over land and water...");
    }
}

