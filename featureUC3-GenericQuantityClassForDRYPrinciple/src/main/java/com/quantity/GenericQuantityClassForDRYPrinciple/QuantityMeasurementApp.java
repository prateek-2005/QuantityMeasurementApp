package com.quantity.GenericQuantityClassForDRYPrinciple;
enum LengthUnit {

	FEET(12.0),
	INCHES(1.0);

	private final double conversionFactor;

	LengthUnit(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public double getConversionFactor() {
		return conversionFactor;
	}
}
class Length {

	private double value;
	private LengthUnit unit;

	public Length(double value, LengthUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	private double convertToBaseUnit() {
		return this.value * this.unit.getConversionFactor();
	}

	public boolean compareLength(Length other) {
		if (other == null) {
			return false;
		}

		double thisInches = this.convertToBaseUnit();
		double otherInches = other.convertToBaseUnit();

		return thisInches == otherInches;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Length other = (Length) obj;

		return compareLength(other);
	}

	@Override
	public String toString() {
		return value + " " + unit;
	}
}

public class QuantityMeasurementApp {

	public static void main(String[] args) {

		Length length1 = new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);

		System.out.println("Length1: " + length1);
		System.out.println("Length2: " + length2);

		if (length1.equals(length2)) {
			System.out.println("Both lengths are equal ");
		} else {
			System.out.println("Lengths are NOT equal ");
		}
	}
}
