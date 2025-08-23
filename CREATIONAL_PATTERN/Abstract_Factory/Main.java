package SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory;

import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.car_factories.BMWFactory;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.car_factories.HondaFactory;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.Vehicle;
import SystemDesignLLD.CREATIONAL_PATTERN.Abstract_Factory.interfaces.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();

        VehicleFactory bmwFactory = new BMWFactory();
        Vehicle bmw = bmwFactory.createVehicle();
        bmw.start();
        bmw.stop();
    }
}
