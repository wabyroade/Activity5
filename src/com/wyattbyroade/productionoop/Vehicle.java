package com.wyattbyroade.productionoop;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;
  String chassis;

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleChassis();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  @Override
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
      vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public int getEngineCylinders() {
    return vehicleEngine.getEngineCylinders();
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
      vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public Date getEngineManufacturedDate() {
    return vehicleEngine.getEngineManufacturedDate();
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
      vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public String getEngineManufacturer() {
    return vehicleEngine.getEngineManufacturer();
  }

  @Override
  public void setEngineMake(String engineMake) {
      vehicleEngine.setEngineManufacturer(engineMake);
  }

  @Override
  public String getEngineMake() {
    return vehicleEngine.getEngineMake();
  }

  @Override
  public void setEngineModel(String engineModel) {
      vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public String getEngineModel() {
    return vehicleEngine.getEngineModel();
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
      vehicleEngine.setEngineType(fuel);
  }

  @Override
  public String getEngineType() {
    return null;
  }

  public String toString() {
    return "Manufacturer Name : Generic"
        + "Manufactured Date : " + vehicleManufacturedDate + "\n"
        + "Vehicle Make : " + vehicleMake + "\n"
        + "Vehicle Model : " + vehicleModel + "\n"
        + "Vehicle Type : " + vehicleType + "\n"
        + "Engine Manufacturer : " + vehicleEngine.getEngineManufacturer() + "\n"
        + "Engine Manufactured : " + vehicleEngine.getEngineManufacturedDate() + "\n"
        + "Engine Make : " + vehicleEngine.getEngineMake() + "\n"
        + "Engine Model : " + vehicleEngine.getEngineModel() + "\n"
        + "Engine Type ; " + vehicleEngine.getEngineType() + "\n"
        + "Engine Cylinders : " + vehicleEngine.getEngineCylinders() + "\n"
        + "Drive Train : " + driveTrain;
  }
}
