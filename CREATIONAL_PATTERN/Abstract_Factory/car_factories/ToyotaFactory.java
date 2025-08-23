package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.car_factories;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars.Toyota;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.VehicleFactory;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
