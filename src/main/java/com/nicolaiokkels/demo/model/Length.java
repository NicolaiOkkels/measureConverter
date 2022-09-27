package com.nicolaiokkels.demo.model;

import java.util.Arrays;
import java.util.Objects;

public class Length {

    final String METRIC = "M";
    final String IMPERIAL = "I";

    private double measure;
    private String system;

    public Length(double measure, String system) throws IllegalArgumentException {
        if(!Arrays.asList(METRIC, IMPERIAL).contains(system)){
            throw new IllegalArgumentException("Invalid length system");
        } else {
            this.measure = Math.abs(measure);
            this.system = system;
        }
    }

    public double convert(){
        if(this.system == METRIC){
            return Math.round((this.measure * 0.393701) * 100.0) / 100.0;
        } else {
            return Math.round((this.measure * 2.54) * 100.0) / 100.0;
        }
    }
}
