package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;

public class Toyota implements Vehicle {
    @Override
    public void start() {
        System.out.println("Toyota is ready!");
    }

    @Override
    public void stop() {
        System.out.println("Toyota stopped!");
    }
}
