package com.quantity.QuantityMeasurementApp;

import java.util.Scanner;

public class QuantityMeasurementApp {

	public static <U extends IMeasurable> void demonstrateEquality(Quantity<U> q1, Quantity<U> q2) {
		System.out.println("Compare " + q1 + " and " + q2 + " -> Equal: " + q1.equals(q2));
	}

	public static <U extends IMeasurable> void demonstrateConversion(Quantity<U> quantity, U target) {
		System.out.println("Convert " + quantity + " to " + target + " -> " + quantity.convertTo(target));
	}

	public static <U extends IMeasurable> void demonstrateAddition(Quantity<U> q1, Quantity<U> q2, U target) {
		System.out.println("Add " + q1 + " and " + q2 + " -> " + q1.add(q2, target));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length1 value:");
		double l1Value = sc.nextDouble();

		System.out.println("Enter Length2 value:");
		double l2Value = sc.nextDouble();

		Quantity<LengthUnit> l1 = new Quantity<>(l1Value, LengthUnit.FEET);

		Quantity<LengthUnit> l2 = new Quantity<>(l2Value, LengthUnit.INCH);

		demonstrateEquality(l1, l2);
		demonstrateConversion(l1, LengthUnit.INCH);
		demonstrateAddition(l1, l2, LengthUnit.FEET);

		System.out.println("Enter Weight1 value:");
		double w1Value = sc.nextDouble();

		System.out.println("Enter Weight2 value:");
		double w2Value = sc.nextDouble();

		Quantity<WeightUnit> w1 = new Quantity<>(w1Value, WeightUnit.KILOGRAM);

		Quantity<WeightUnit> w2 = new Quantity<>(w2Value, WeightUnit.GRAM);

		demonstrateEquality(w1, w2);
		demonstrateConversion(w1, WeightUnit.GRAM);
		demonstrateAddition(w1, w2, WeightUnit.KILOGRAM);

		System.out.println("Enter Volume1 value:");
		double v1Value = sc.nextDouble();

		System.out.println("Enter Volume2 value:");
		double v2Value = sc.nextDouble();

		Quantity<VolumeUnit> v1 = new Quantity<>(v1Value, VolumeUnit.LITRE);

		Quantity<VolumeUnit> v2 = new Quantity<>(v2Value, VolumeUnit.MILLILITRE);

		demonstrateEquality(v1, v2);

		System.out.println("Enter Length3 value:");
		double l4Value = sc.nextDouble();

		System.out.println("Enter Length4 value:");
		double l6Value = sc.nextDouble();

		Quantity<LengthUnit> l4 = new Quantity<>(l4Value, LengthUnit.FEET);

		Quantity<LengthUnit> l6 = new Quantity<>(l6Value, LengthUnit.INCH);

		System.out.println("Subtract: " + l1.subtract(l2));
		System.out.println("Subtract (explicit inches): " + l4.subtract(l6, LengthUnit.INCH));

		System.out.println("Enter value to divide length:");
		double divValue = sc.nextDouble();

		System.out.println("Divide: " + l1.divide(new Quantity<>(divValue, LengthUnit.FEET)));

		System.out.println("Enter Weight3 value:");
		double w5Value = sc.nextDouble();

		System.out.println("Enter Weight4 value:");
		double w8Value = sc.nextDouble();

		Quantity<WeightUnit> w5 = new Quantity<>(w5Value, WeightUnit.KILOGRAM);

		Quantity<WeightUnit> w8 = new Quantity<>(w8Value, WeightUnit.KILOGRAM);

		System.out.println("Weight division: " + w5.divide(w8));

		sc.close();
	}
}