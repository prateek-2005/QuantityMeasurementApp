package com.quantity.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    QuantityMeasurementApp app = new QuantityMeasurementApp();


    @Test
    void givenFeetAndInch_whenAddedInInch_shouldReturnCorrectValue() {

        double result = app.addLengths(
                1.0, LengthUnit.FEET,
                2.0, LengthUnit.INCH,
                LengthUnit.INCH);

        assertEquals(14.0, result);
    }


    @Test
    void givenFeetAndInch_whenAddedInFeet_shouldReturnCorrectValue() {

        double result = app.addLengths(
                1.0, LengthUnit.FEET,
                2.0, LengthUnit.INCH,
                LengthUnit.FEET);

        assertEquals(1.166, result, 0.01);
    }


    @Test
    void givenYardAndFeet_whenAddedInYard_shouldReturnCorrectValue() {

        double result = app.addLengths(
                1.0, LengthUnit.YARD,
                1.0, LengthUnit.FEET,
                LengthUnit.YARD);

        assertEquals(1.333, result, 0.01);
    }


    @Test
    void givenCmAndInch_whenAddedInInch_shouldReturnCorrectValue() {

        double result = app.addLengths(
                2.54, LengthUnit.CM,
                1.0, LengthUnit.INCH,
                LengthUnit.INCH);

        assertEquals(2.0, result, 0.01);
    }
}