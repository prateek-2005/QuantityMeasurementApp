package com.quantity.QuantityMeasurementApp;

import java.util.Scanner;

public class QuantityMeasurementApp {
	public double addLengths(double value1, LengthUnit unit1, double value2, LengthUnit unit2, LengthUnit targetUnit) {

		Length l1 = new Length(value1, unit1);
		Length l2 = new Length(value2, unit2);

		return l1.add(l2, targetUnit);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		QuantityMeasurementApp app = new QuantityMeasurementApp();

		System.out.println("Enter first value:");
		double value1 = sc.nextDouble();

		System.out.println("Enter first unit (INCH, FEET, YARD, CM):");
		LengthUnit unit1 = LengthUnit.valueOf(sc.next().toUpperCase());

		System.out.println("Enter second value:");
		double value2 = sc.nextDouble();

		System.out.println("Enter second unit (INCH, FEET, YARD, CM):");
		LengthUnit unit2 = LengthUnit.valueOf(sc.next().toUpperCase());

		System.out.println("Enter target unit for result:");
		LengthUnit targetUnit = LengthUnit.valueOf(sc.next().toUpperCase());

		double result = app.addLengths(value1, unit1, value2, unit2, targetUnit);

		System.out.println("Result = " + result + " " + targetUnit);

		sc.close();
	}
}