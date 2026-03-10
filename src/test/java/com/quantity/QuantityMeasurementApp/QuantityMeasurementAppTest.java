package com.quantity.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testLengthAddition() {

        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(2.0, LengthUnit.INCH);

        double result = q1.add(q2, LengthUnit.INCH);

        assertEquals(14.0, result);
    }

    @Test
    void testWeightAddition() {

        Quantity<WeightUnit> q1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> q2 = new Quantity<>(500.0, WeightUnit.GRAM);

        double result = q1.add(q2, WeightUnit.GRAM);

        assertEquals(1500.0, result);
    }
}