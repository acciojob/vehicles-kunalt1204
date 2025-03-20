package com.driver;

public class Boat implements WaterVehicle{

    public String VehicleName;
    public int VehicleCapacity;

    public void VehicleName(String VehicleName){
        this.VehicleName = VehicleName;
    }

    public void VehicleCapacity(int VehicleCapacity){
        this.VehicleCapacity = VehicleCapacity;
    }

    public String getVehicleName(){
        return this.VehicleName;
    }

    public int getVehicleCapacity(){
        return this.VehicleCapacity;
    }


}
