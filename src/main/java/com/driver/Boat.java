package com.driver;

public class Boat implements WaterVehicle {
    // Private fields for encapsulation
    private String vehicleName;
    private int vehicleCapacity;

    // Constructor to initialize the boat's properties
    public Boat(String vehicleName, int vehicleCapacity) {
        this.vehicleName = vehicleName;
        this.vehicleCapacity = vehicleCapacity;
    }

    // Setter for vehicle name
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Setter for vehicle capacity
    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    // Implementation of getVehicleName from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return this.vehicleName;
    }

    // Implementation of getVehicleCapacity from WaterVehicle interface
    @Override
    public int getVehicleCapacity() {
        return this.vehicleCapacity;
    }
}
