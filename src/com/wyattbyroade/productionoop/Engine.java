package com.wyattbyroade.productionoop;

import java.util.Date;

public interface Engine {
  void setEngineCylinders(int engineCylinders);
  int getEngineCylinders();
  void setEngineManufacturedDate(Date date);
  Date getEngineManufacturedDate();
  void setEngineManufacturer(String manufacturer);
  String getEngineManufacturer();
  void setEngineMake(String engineMake);
  String getEngineMake();
  void setEngineModel(String engineModel);
  String getEngineModel();
  void setDriveTrain(String driveTrain);
  String getDriveTrain();
  void setEngineType(String fuel);
  String getEngineType();
}
