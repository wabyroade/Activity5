package com.wyattbyroade.productionoop;

public class InteriorFeature implements Feature {

    private String interiorFeature;

    public InteriorFeature() {
        interiorFeature = "Generic";
    }

    public InteriorFeature(String feature) {
        interiorFeature = feature;
    }

    @Override
    public String getFeature() {
        return interiorFeature;
    }

    @Override
    public void setFeature(String feature) {
        interiorFeature = feature;
    }

    public String toString() {
        return "Interior [" + interiorFeature + "]";
    }
}
