package com.inheritance_hierchical;

public class testvehicle {
    public static void main(String[] args) {
        // Create instances of each subclass
        car car = new car();
        bike bike = new bike();
        truck truck = new truck();

        // Access methods for Car
        System.out.println("Car actions:");
        car.start();   // From Vehicle
        car.drive();   // From Car
        car.refuel();  // From Car
        car.stop();    // From Vehicle

        // Access methods for Bike
        System.out.println("\nBike actions:");
        bike.start();     // From Vehicle
        bike.ride();      // From Bike
        bike.kickStart(); // From Bike
        bike.stop();      // From Vehicle

        // Access methods for Truck
        System.out.println("\nTruck actions:");
        truck.start();       // From Vehicle
        truck.loadCargo();   // From Truck
        truck.unloadCargo(); // From Truck
        truck.stop();        // From Vehicle
    }
}
