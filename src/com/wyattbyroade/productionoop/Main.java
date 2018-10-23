package com.wyattbyroade.productionoop;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*
        VehicleFrame testChassis1 = new VehicleFrame();
        VehicleFrame testChassis2 = new VehicleFrame("Ladder Frame");

        System.out.println(testChassis1);
        System.out.println(testChassis2);
        System.out.println("");

        Date currentDate = new Date();
        ManufacturedEngine testEngine1 = new ManufacturedEngine();
        ManufacturedEngine testEngine2 = new ManufacturedEngine("Honda", currentDate,
                "H-Series", "H23A1",4,"88 AKI","4WD");
        System.out.println(testEngine1);
        System.out.println(testEngine2);
        System.out.println("");

        ExteriorFeature extFeature1 = new ExteriorFeature();
        System.out.println(extFeature1);
        ExteriorFeature extFeature2 = new ExteriorFeature("Fog Lamps");
        System.out.println(extFeature2);
        System.out.println("");

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);
        Vehicle vehicle2 = new Vehicle(new Date(), "Honda","Honda","Prelude",
                new VehicleFrame(),"88 AKI","2WD: Two-Wheel Drive",new ManufacturedEngine());
        System.out.println(vehicle2);
        System.out.println("");
        */

        Feature feature1 = new ExteriorFeature();
        Feature feature2 = new ExteriorFeature("Fog Lamps");
        Feature feature3 = new InteriorFeature();
        Feature feature4 = new InteriorFeature("MP3 Player");

        Feature[] featureParam = new Feature[10];
        featureParam[0] = feature1;
        featureParam[1] = feature2;
        featureParam[2] = feature3;
        featureParam[3] = feature4;
        Car testCar1 = new Car(new Date(), "Honda","Honda","Prelude",
                new VehicleFrame(),"88 AKI","2WD: Two-Wheel Drive",new ManufacturedEngine(),featureParam,2);
        System.out.println(testCar1);
        System.out.println("");
//        System.out.println(testCar1.getExteriorFeatures());
//        System.out.println(testCar1.getInteriorFeatures());
    }
}
