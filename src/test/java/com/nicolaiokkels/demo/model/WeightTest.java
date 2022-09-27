package com.nicolaiokkels.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightTest {

    @Test
    public void weight_exception(){
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    new Length(50, "pounds");
                }
        );

        assertEquals("Invalid length system", exception.getMessage());
    }

    @Test
    void convert_to_metric() {
        Weight weight = new Weight(50, "KG");

        double expectedValue = 22.68;

        assertEquals(expectedValue,weight.convert());
    }

    @Test
    void convert_to_imperial() {
        Weight weight = new Weight(50, "P");

        double expectedValue = 110.23;

        assertEquals(expectedValue,weight.convert());
    }
}