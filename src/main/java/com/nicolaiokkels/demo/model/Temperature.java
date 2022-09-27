package com.nicolaiokkels.demo.model;

import java.util.Arrays;

public class Temperature {
    final String[] TEMPERATURE_SCALE = {"C to F","C to K", "F to C","F to K","K to C","K to F"};
    private double measure;
    private String scale;

    public Temperature(double measure, String scale) throws IllegalArgumentException {
        if(!Arrays.asList(TEMPERATURE_SCALE).contains(scale)){
            throw new IllegalArgumentException("Invalid scale");
        } else {
            this.measure = measure;
            this.scale = scale;
        }
    }

    public double convert(){
        String conversion = this.scale;
        double result = 0;
        switch (conversion) {
            case "C to F":
                result = (this.measure * 1.8) + 32;
                break;
            case "C to K":
                result = this.measure + 273.15;
                break;
            case "F to C":
                result = ((this.measure - 32) * 5) / 9;
                break;
            case "F to K":
                result = (((this.measure - 32) * 5) / 9) + 273.15;
                break;
            case "K to C":
                result = this.measure - 273.15;
                break;
            case "K to F":
                result = (((this.measure - 273.15) * 9) / 5) + 32;
                break;
        }
        return result;
    }
}
