package com.nicolaiokkels.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void convert_from_c_to_f() {
        Temperature temperature = new Temperature(100, "C to F");

        double expectedValue = 212;

        assertEquals(expectedValue,temperature.convert());
    }
    @Test
    void convert_from_c_to_k() {
        Temperature temperature = new Temperature(100, "C to K");

        double expectedValue = 373.15;

        assertEquals(expectedValue,temperature.convert());
    }
    @Test
    void convert_from_f_to_c() {
        Temperature temperature = new Temperature(98.6, "F to C");

        double expectedValue = 37.0;

        assertEquals(expectedValue,temperature.convert());
    }
    @Test
    void convert_from_f_to_k() {
        Temperature temperature = new Temperature(98.6, "F to K");

        double expectedValue = 310.15;

        assertEquals(expectedValue,temperature.convert());
    }
    @Test
    void convert_from_k_to_c() {
        Temperature temperature = new Temperature(500, "K to C");

        double expectedValue = 226.85000000000002;

        assertEquals(expectedValue,temperature.convert());
    }
    @Test
    void convert_from_k_to_f() {
        Temperature temperature = new Temperature(310.15, "K to F");

        double expectedValue = 98.6;

        assertEquals(expectedValue,temperature.convert());
    }
}