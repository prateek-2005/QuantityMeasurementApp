package com.quantity.Addition_Of_Two_Length_Units;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    QuantityMeasurementApp app = new QuantityMeasurementApp();


    @Test
    void givenFeetAndInch_whenAdded_shouldReturnCorrectInch() {

        double result = app.addLengths(
                1.0, LengthUnit.FEET,
                2.0, LengthUnit.INCH,
                LengthUnit.INCH);

        assertEquals(14.0, result);
    }


    @Test
    void givenYardAndFeet_whenAdded_shouldReturnCorrectFeet() {

        double result = app.addLengths(
                1.0, LengthUnit.YARD,
                1.0, LengthUnit.FEET,
                LengthUnit.FEET);

        assertEquals(4.0, result);
    }


    @Test
    void givenCmAndInch_whenAdded_shouldReturnCorrectInch() {

        double result = app.addLengths(
                2.54, LengthUnit.CM,
                1.0, LengthUnit.INCH,
                LengthUnit.INCH);

        assertEquals(2.0, result, 0.01);
    }


    @Test
    void givenSameUnits_whenAdded_shouldReturnCorrectResult() {

        double result = app.addLengths(
                5.0, LengthUnit.FEET,
                5.0, LengthUnit.FEET,
                LengthUnit.FEET);

        assertEquals(10.0, result);
    }
}