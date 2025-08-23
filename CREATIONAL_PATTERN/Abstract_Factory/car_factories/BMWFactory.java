package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.car_factories;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.concrete_cars.BMW;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.VehicleFactory;

public class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
