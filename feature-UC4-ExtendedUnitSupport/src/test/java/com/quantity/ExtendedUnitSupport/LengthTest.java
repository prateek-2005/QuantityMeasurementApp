package com.quantity.ExtendedUnitSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void givenFeetAndInch_shouldBeEqual() {

        Length feet = new Length(1, LengthUnit.FEET);
        Length inch = new Length(12, LengthUnit.INCH);

        assertTrue(feet.equals(inch));
    }

    @Test
    void givenYardAndInch_shouldBeEqual() {

        Length yard = new Length(1, LengthUnit.YARD);
        Length inch = new Length(36, LengthUnit.INCH);

        assertTrue(yard.equals(inch));
    }

    @Test
    void givenCmAndInch_shouldBeEqual() {

        Length cm = new Length(2.54, LengthUnit.CM);
        Length inch = new Length(1, LengthUnit.INCH);

        assertTrue(cm.equals(inch));
    }

    @Test
    void givenDifferentValues_shouldNotBeEqual() {

        Length l1 = new Length(2, LengthUnit.FEET);
        Length l2 = new Length(12, LengthUnit.INCH);

        assertFalse(l1.equals(l2));
    }
}
