package com.quantity.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    QuantityMeasurementApp app = new QuantityMeasurementApp();

    @Test
    void testLengthAddition() {
        double result = app.addLengths(1.0, LengthUnit.FEET, 2.0, LengthUnit.INCH, LengthUnit.INCH);
        assertEquals(14.0, result);
    }

    @Test
    void testLengthAdditionFeet() {
        double result = app.addLengths(1.0, LengthUnit.FEET, 2.0, LengthUnit.INCH, LengthUnit.FEET);
        assertEquals(1.166, result, 0.01);
    }

    @Test
    void testWeightAdditionGram() {
        double result = app.addWeights(1.0, WeightUnit.KILOGRAM, 500.0, WeightUnit.GRAM, WeightUnit.GRAM);
        assertEquals(1500.0, result);
    }

    @Test
    void testWeightAdditionKg() {
        double result = app.addWeights(1.0, WeightUnit.KILOGRAM, 500.0, WeightUnit.GRAM, WeightUnit.KILOGRAM);
        assertEquals(1.5, result, 0.01);
    }
}