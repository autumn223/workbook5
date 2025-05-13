package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped moped = new Moped("Red", 1, 10, 5, true);
        System.out.println("Helmet required: " + moped.isHelmetRequired());
        moped.ringBell();

        Car car = new Car("Blue", 4, 200, 40, 16);
        System.out.println("Car trunk size: " + car.getTrunkSize());
        car.honkHorn();

        SemiTruck truck = new SemiTruck("White", 2, 1500, 120, 3);
        System.out.println("Truck trailers: " + truck.getNumberOfTrailers());
        truck.attachTrailer();

        Hovercraft hover = new Hovercraft("Gray", 3, 500, 70, 6);
        System.out.println("Hover height: " + hover.getHoverHeight());
        hover.glide();
    }
}