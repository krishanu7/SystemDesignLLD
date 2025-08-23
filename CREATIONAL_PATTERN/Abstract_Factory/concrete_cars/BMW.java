package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;

public class BMW implements Vehicle {
    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }
}
