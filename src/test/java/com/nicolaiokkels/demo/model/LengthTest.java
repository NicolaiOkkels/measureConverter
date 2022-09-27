package com.nicolaiokkels.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    public void length_exception(){
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    new Length(10, "F");
                }
        );

        assertEquals("Invalid length system", exception.getMessage());
    }

    @Test
    void convert_to_metric() {
        Length length = new Length(10, "M");

        double expectedValue = 3.94;

        assertEquals(expectedValue,length.convert());
    }

    @Test
    void convert_to_imperial() {
        Length length = new Length(10, "I");

        double expectedValue = 25.4;

        assertEquals(expectedValue,length.convert());
    }
}