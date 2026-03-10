package com.quantity.QuantityMeasurementApp;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public static <U extends IMeasurable>
    void demonstrateEquality(Quantity<U> q1, Quantity<U> q2) {

        System.out.println("Compare " + q1 +
                " and " + q2 +
                " -> Equal: " + q1.equals(q2));
    }

    public static <U extends IMeasurable>
    void demonstrateConversion(Quantity<U> quantity, U target) {

        System.out.println("Convert " + quantity +
                " to " + target +
                " -> " + quantity.convertTo(target));
    }

    public static <U extends IMeasurable>
    void demonstrateAddition(Quantity<U> q1, Quantity<U> q2, U target) {

        System.out.println("Add " + q1 +
                " and " + q2 +
                " -> " + q1.add(q2, target));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length 1 value:");
        double v1 = sc.nextDouble();
        System.out.println("Enter unit (FEET/INCH):");
        LengthUnit u1 = LengthUnit.valueOf(sc.next());

        System.out.println("Enter Length 2 value:");
        double v2 = sc.nextDouble();
        System.out.println("Enter unit (FEET/INCH):");
        LengthUnit u2 = LengthUnit.valueOf(sc.next());

        Quantity<LengthUnit> l1 = new Quantity<>(v1, u1);
        Quantity<LengthUnit> l2 = new Quantity<>(v2, u2);

        demonstrateEquality(l1, l2);

        System.out.println("Enter target unit for conversion (FEET/INCH):");
        LengthUnit target = LengthUnit.valueOf(sc.next());

        demonstrateConversion(l1, target);
        demonstrateAddition(l1, l2, target);

        sc.close();
    }
}