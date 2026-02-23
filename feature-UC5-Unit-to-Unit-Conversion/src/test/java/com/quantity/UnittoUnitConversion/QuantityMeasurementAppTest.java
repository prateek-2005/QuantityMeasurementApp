package com.quantity.UnittoUnitConversion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    QuantityMeasurementApp app = new QuantityMeasurementApp();


    @Test
    void givenFeet_whenConvertedToInch_shouldReturnCorrectValue() {

        double result = app.convert(1.0, LengthUnit.FEET, LengthUnit.INCH);

        assertEquals(12.0, result);
    }


    @Test
    void givenInch_whenConvertedToFeet_shouldReturnCorrectValue() {

        double result = app.convert(12.0, LengthUnit.INCH, LengthUnit.FEET);

        assertEquals(1.0, result);
    }


    @Test
    void givenYard_whenConvertedToInch_shouldReturnCorrectValue() {

        double result = app.convert(1.0, LengthUnit.YARD, LengthUnit.INCH);

        assertEquals(36.0, result);
    }


    @Test
    void givenCm_whenConvertedToInch_shouldReturnCorrectValue() {

        double result = app.convert(2.54, LengthUnit.CM, LengthUnit.INCH);

        assertEquals(1.0, result, 0.0001);
    }


    @Test
    void givenInch_whenConvertedToCm_shouldReturnCorrectValue() {

        double result = app.convert(1.0, LengthUnit.INCH, LengthUnit.CM);

        assertEquals(2.54, result, 0.01);
    }
}