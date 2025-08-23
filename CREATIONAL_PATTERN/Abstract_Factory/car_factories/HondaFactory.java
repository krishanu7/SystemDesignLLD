package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.car_factories;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars.Honda;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.VehicleFactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
