package SystemDesignLLD.CREATIONAL_PATTERN.Factory.Concrete_Vehicles;

import SystemDesignLLD.CREATIONAL_PATTERN.Factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is started...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped...");
    }
}
