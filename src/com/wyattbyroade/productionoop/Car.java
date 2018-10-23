package com.wyattbyroade.productionoop;

import java.util.Date;

public class Car extends Vehicle {
    private Feature[] feature = new Feature[10];
    private int carAxle;
    private static int arrCount = 0;

    public Car() {
        super();
        carAxle = 2;
        feature[0] = new InteriorFeature("No Interior Features");
        feature[1] = new ExteriorFeature("No Exterior Features");
    }

    public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
               String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
               Engine vehicleEngine, Feature[] feature, int carAxle) {
        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
                vehicleType, driveTrain, vehicleEngine);
        this.carAxle = carAxle;
        this.feature = feature;
    }

    public String getExteriorFeatures() {
        StringBuilder returnString = new StringBuilder();
        for (Feature thisFeature:feature) {
            if (thisFeature != null && thisFeature.getClass() == ExteriorFeature.class) {
                returnString.append(thisFeature);
                returnString.append("\n");
            }
        }
        return returnString.toString();
    }

    public String getInteriorFeatures() {
        StringBuilder returnString = new StringBuilder();
        for (Feature thisFeature:feature) {
            if (thisFeature != null && thisFeature.getClass() == InteriorFeature.class) {
                returnString.append(thisFeature);
                returnString.append("\n");
            }
        }
        return returnString.toString();
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("Manufacturer Name   : " + vehicleManufacturer + "\n");
        returnString.append("Manufacturer Date   : " + vehicleManufacturedDate + "\n");
        returnString.append("Vehicle Make        : " + vehicleMake + "\n");
        returnString.append("Vehicle Model       : " + vehicleModel + "\n");
        returnString.append("Vehicle Type        : " + vehicleType + "\n");
        returnString.append(vehicleEngine + "\n");
        returnString.append("Features : \n");
        returnString.append(getInteriorFeatures());
        returnString.append(getExteriorFeatures());
        returnString.append("Car Axle            : " + carAxle);
        return returnString.toString();
    }
}
