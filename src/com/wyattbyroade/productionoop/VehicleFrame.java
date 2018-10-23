package com.wyattbyroade.productionoop;

public class VehicleFrame implements Chassis {

    private String vehicleFrameType;

    public VehicleFrame() {
        vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = chassis;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrameType = vehicleChassis;
    }

    public String toString() {
        return "Chassis:        : " + chassis + "\n"
                + "Vehicle Frame:     : " + vehicleFrameType;
    }
}
