package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 10, 5);
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);

        Car fastCar = new Car("Green", 4, 200, 10);
//        fastCar.setColor("Green");
//        fastCar.setFuelCapacity(10);

        SemiTruck bigTruck = new SemiTruck("Black", 10, 400, 20);
//        bigTruck.setColor("Black");
//        bigTruck.setFuelCapacity(20);

        Hovercraft hovercraft = new Hovercraft("Blue", 20, 500, 40);
//        hovercraft.setColor("Blue");
//        hovercraft.setFuelCapacity(40);

        System.out.println("Car Information");
        fastCar.displayInfo();

        System.out.println("\nMoped Information");
        slowRide.displayInfo();

        System.out.println("\nTruck information");
        bigTruck.displayInfo();


        System.out.println("\nHovercraft Information");
        hovercraft.displayInfo();


//        System.out.println("Moped Color: " +  slowRide.getColor());
//        System.out.println("Car fuel Capacity: " + fastCar.getFuelCapacity());
//        System.out.println("SemiTruck color: " + bigTruck.getColor());
//        System.out.println("Hovercraft fuel capacity: " + hovercraft.getFuelCapacity());
    }
}
