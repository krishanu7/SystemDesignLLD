package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;

public class Honda implements Vehicle {
    @Override
    public void start() {
        System.out.println("Honda is running");
    }
    @Override
    public void stop() {
        System.out.println("Honda is stopped");
    }
}
