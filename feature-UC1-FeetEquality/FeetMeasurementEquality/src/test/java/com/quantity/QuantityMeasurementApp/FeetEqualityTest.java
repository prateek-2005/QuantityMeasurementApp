package com.quantity.QuantityMeasurementApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetEqualityTest {
	@Test
	void testEquality_SameValue() {

		FeetEquality.Feet feet1 = new FeetEquality.Feet(1.0);

		FeetEquality.Feet feet2 = new FeetEquality.Feet(1.0);

		assertTrue(feet1.equals(feet2), "1.0 ft should be equal to 1.0 ft");
	}

	@Test
	void testEquality_DifferentValue() {

		FeetEquality.Feet feet1 = new FeetEquality.Feet(1.0);

		FeetEquality.Feet feet2 = new FeetEquality.Feet(2.0);

		assertFalse(feet1.equals(feet2), "1.0 ft should not equal 2.0 ft");
	}

	@Test
	void testEquality_NullComparison() {

		FeetEquality.Feet feet = new FeetEquality.Feet(1.0);

		assertFalse(feet.equals(null), "Feet should not be equal to null");
	}

	@Test
	void testEquality_SameReference() {

		FeetEquality.Feet feet = new FeetEquality.Feet(1.0);

		assertTrue(feet.equals(feet), "Object should equal itself");
	}

	@Test
	void testEquality_DifferentType() {

		FeetEquality.Feet feet = new FeetEquality.Feet(1.0);

		String other = "1.0";

		assertFalse(feet.equals(other), "Feet should not equal different type");
	}
}