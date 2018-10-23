package com.wyattbyroade.productionoop;

import java.util.Date;

public class ManufacturedEngine implements Engine {

    public String engineManufacturer;
    public Date engineManufacturedDate;
    public String engineMake;
    public String engineModel;
    public int engineCylinders;
    public String engineType;
    public String driveTrain;

    public ManufacturedEngine() {
        engineManufacturer = "Generic";
        engineManufacturedDate = new Date();
        engineMake = "Generic";
        engineModel = "Generic";
        engineCylinders = 2;
        engineType = "85 AKI";
        driveTrain = "2WD: Two-Wheel Drive";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake,
                              String engineModel, int engineCylinders, String engineType, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public int getEngineCylinders() {
        return engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        engineManufacturedDate = date;
    }

    @Override
    public Date getEngineManufacturedDate() {
        return engineManufacturedDate;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        engineManufacturer = manufacturer;
    }

    @Override
    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public String getEngineMake() {
        return engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public String getEngineModel() {
        return engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public String getDriveTrain() {
        return driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        engineType = fuel;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    public String toString() {
        return "Engine Manufacturer  : " + engineManufacturer + "\n"
                + "Engine Manufactured  : " + engineManufacturedDate + "\n"
                + "Engine Make          : " + engineMake + "\n"
                + "Engine Model         ; " + engineModel + "\n"
                + "Engine Type          : " + engineType + "\n"
                + "Engine Cylinders     ; " + engineCylinders + "\n"
                + "Drive Train          : " + driveTrain;
    }
}
