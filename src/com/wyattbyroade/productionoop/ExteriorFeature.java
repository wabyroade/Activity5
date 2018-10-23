package com.wyattbyroade.productionoop;

public class ExteriorFeature implements Feature {

    String exteriorFeature;

    public ExteriorFeature() {
        exteriorFeature = "Generic";
    }

    public ExteriorFeature(String feature) {
        exteriorFeature = feature;
    }

    public String getFeature() {
        return exteriorFeature;
    }

    @Override
    public void setFeature(String feature) {
        exteriorFeature = feature;
    }

    public String toString() {
        return "Exterior [" + exteriorFeature + "]";
    }
}
