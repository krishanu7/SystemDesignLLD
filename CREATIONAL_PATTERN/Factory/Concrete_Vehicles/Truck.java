package SystemDesignLLD.CREATIONAL_PATTERN.Factory.Concrete_Vehicles;

import SystemDesignLLD.CREATIONAL_PATTERN.Factory.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is started...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped...");
    }
}
