package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<Asset>();

        House house1 = new House("My House", "2020-05-01", 200000,
                "123 Main St", 1, 1800, 4000);

        House house2 = new House("Vacation Home", "2018-07-15", 150000,
                "789 Lake View", 2, 1200, 3000);

        Vehicle car1 = new Vehicle("My Car", "2022-03-10", 25000,
                "Honda Accord", 2022, 30000);

        Vehicle truck1 = new Vehicle("Mary's Truck", "2015-06-22", 40000,
                "Ford F-150", 2015, 120000);

        myAssets.add(house1);
        myAssets.add(house2);
        myAssets.add(car1);
        myAssets.add(truck1);

        for (Asset asset : myAssets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                House h = (House) asset;
                System.out.println("Address: " + h.getAddress());
            }

            else if (asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Vehicle: " + v.getYear() + " " + v.getMakeModel());
            }

            System.out.println();
        }
    }
}
