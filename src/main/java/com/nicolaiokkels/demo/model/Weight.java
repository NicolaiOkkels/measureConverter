package com.nicolaiokkels.demo.model;

import java.util.Arrays;

public class Weight {
    final String METRIC = "KG";
    final String IMPERIAL = "P";

    private double measure;
    private String system;

    public Weight(double measure, String system) throws IllegalArgumentException {
        if(!Arrays.asList(METRIC, IMPERIAL).contains(system)){
            throw new IllegalArgumentException("Invalid weight system");
        } else {
            this.measure = Math.abs(measure);
            this.system = system;
        }
    }

    public double convert(){
        if(this.system == METRIC){
            return Math.round((this.measure * 0.45359237) * 100.0) / 100.0;
        } else {
            return Math.round((this.measure * 2.20462262) * 100.0) / 100.0;
        }
    }
}
