package com.wyattbyroade.productionoop;

public class VehicleChassis implements Chassis {

    String chassisName;

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    public VehicleChassis() {
        this.chassisName = chassis;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        chassisName = vehicleChassis;
    }

    public String toString() {
        return "Chassis Name        : " + chassisName;
    }
}
