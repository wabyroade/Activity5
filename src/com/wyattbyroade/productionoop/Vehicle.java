package com.wyattbyroade.productionoop;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "empty";
    vehicleMake = "empty";
    vehicleModel = "empty";
    vehicleType = "empty";
    driveTrain = "empty";
  }

  /*
  @Override
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine);
  */

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

  public String toString() {
    return "Manufacturer Name : Generic"
        + "Manufactured Date : " + vehicleManufacturedDate;
            /*
        + "Vehicle Make : Generic"
        + "Vehicle Model : Generic"
        + "Vehicle Type : None
        + "Engine Manufacturer : Generic"
        + "Engine Manufactured : " + Engine.manufacturedDate
Engine Make : Generic
Engine Model : Generic
Engine Type : 88 AKI
Engine Cylinders : 0
Drive Train : 2WD: Two-Wheel Drive
*/
  }
}
