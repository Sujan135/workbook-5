package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("Vacation home", "2021-05-12", 150000, "Lake Worth", 2, 1000, 3500));
        myAssets.add(new House("My house ", "2021-05-12", 250000, "Fort Worth", 1, 1000, 3500));

        myAssets.add(new Vehicle("Tom's Truck", "2022-08-12", 30000, "Toyota",2020, 70000 ));
        myAssets.add(new Vehicle("My car", "2022-08-12", 30000, "Acura",2020, 100000 ));

        for (int i = 0; i < myAssets.size(); i++) {
            String message = "";

            if (myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                message = "House at " + house.getAddress();
            }else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            Asset asset = myAssets.get(i);
            System.out.println("\nDescription: " + asset.getDescription());
            System.out.println("Date:" + asset.getDateAcquired());
            System.out.println("Original cost: $" + asset.getOriginalCost());
            System.out.printf("Current value: $%.2f\n" , asset.getValue());
            System.out.println(message);

        }
    }
}
