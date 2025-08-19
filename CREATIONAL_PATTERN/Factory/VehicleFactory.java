package SystemDesignLLD.CREATIONAL_PATTERN.Factory;

import SystemDesignLLD.CREATIONAL_PATTERN.Factory.Concrete_Vehicles.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }else if(vehicleType.equalsIgnoreCase("Bike")){
            return new Bike();
        }else{
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
