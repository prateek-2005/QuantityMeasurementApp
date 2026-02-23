package com.quantity.UnittoUnitConversion;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public double convert(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {

        Length length = new Length(value, sourceUnit);
        return length.convertTo(targetUnit);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        System.out.println("Enter value:");
        double value = sc.nextDouble();

        System.out.println("Enter source unit (INCH, FEET, YARD, CM):");
        LengthUnit sourceUnit = LengthUnit.valueOf(sc.next().toUpperCase());

        System.out.println("Enter target unit (INCH, FEET, YARD, CM):");
        LengthUnit targetUnit = LengthUnit.valueOf(sc.next().toUpperCase());

        double result = app.convert(value, sourceUnit, targetUnit);

        System.out.println("Converted Value: " + result + " " + targetUnit);

        sc.close();
    }
}