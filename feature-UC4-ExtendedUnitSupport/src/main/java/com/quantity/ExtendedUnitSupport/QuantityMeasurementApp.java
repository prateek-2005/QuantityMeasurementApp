package com.quantity.ExtendedUnitSupport;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first length value:");
        double value1 = sc.nextDouble();

        System.out.println("Enter first length unit (INCH, FEET, YARD, CM):");
        String unit1Input = sc.next().toUpperCase();
        LengthUnit unit1 = LengthUnit.valueOf(unit1Input);

        Length l1 = new Length(value1, unit1);

        System.out.println("Enter second length value:");
        double value2 = sc.nextDouble();

        System.out.println("Enter second length unit (INCH, FEET, YARD, CM):");
        String unit2Input = sc.next().toUpperCase();
        LengthUnit unit2 = LengthUnit.valueOf(unit2Input);

        Length l2 = new Length(value2, unit2);

        boolean result = l1.equals(l2);

        if (result) {
            System.out.println("Both lengths are equal");
        } else {
            System.out.println("Both lengths are NOT equal ");
        }

        sc.close();
    }
}
