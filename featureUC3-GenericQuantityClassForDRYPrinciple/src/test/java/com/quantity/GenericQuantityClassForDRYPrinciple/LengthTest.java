package com.quantity.GenericQuantityClassForDRYPrinciple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void givenSameFeet_shouldReturnTrue() {

        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(5.0, LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    @Test
    void givenDifferentFeet_shouldReturnFalse() {

        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(6.0, LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    @Test
    void givenFeetAndInchesEqual_shouldReturnTrue() {

        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    @Test
    void givenFeetAndInchesNotEqual_shouldReturnFalse() {

        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(10.0, LengthUnit.INCHES);

        assertFalse(l1.equals(l2));
    }

    @Test
    void givenNull_shouldReturnFalse() {

        Length l1 = new Length(1.0, LengthUnit.FEET);

        assertFalse(l1.equals(null));
    }

    @Test
    void givenSameObject_shouldReturnTrue() {

        Length l1 = new Length(1.0, LengthUnit.FEET);

        assertTrue(l1.equals(l1));
    }

}
