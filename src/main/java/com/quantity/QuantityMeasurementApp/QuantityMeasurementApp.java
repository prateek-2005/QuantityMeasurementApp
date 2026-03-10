package com.quantity.QuantityMeasurementApp;

import java.util.Scanner;

public class QuantityMeasurementApp {

	public double addLengths(double v1, LengthUnit u1, double v2, LengthUnit u2, LengthUnit target) {

		Length l1 = new Length(v1, u1);
		Length l2 = new Length(v2, u2);

		return l1.add(l2, target);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		QuantityMeasurementApp app = new QuantityMeasurementApp();

		System.out.println("Enter first value:");
		double v1 = sc.nextDouble();

		System.out.println("Enter first unit (INCH, FEET, YARD, CM):");
		LengthUnit u1 = LengthUnit.valueOf(sc.next().toUpperCase());

		System.out.println("Enter second value:");
		double v2 = sc.nextDouble();

		System.out.println("Enter second unit (INCH, FEET, YARD, CM):");
		LengthUnit u2 = LengthUnit.valueOf(sc.next().toUpperCase());

		System.out.println("Enter target unit:");
		LengthUnit target = LengthUnit.valueOf(sc.next().toUpperCase());

		double result = app.addLengths(v1, u1, v2, u2, target);

		System.out.println("Result = " + result + " " + target);

		sc.close();
	}
}