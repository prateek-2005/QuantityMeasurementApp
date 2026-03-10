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

        System.out.println("Enter length value 1:");
        double len1 = sc.nextDouble();

        System.out.println("Enter length value 2:");
        double len2 = sc.nextDouble();

        Quantity<LengthUnit> l1 =
                new Quantity<>(len1, LengthUnit.FEET);

        Quantity<LengthUnit> l2 =
                new Quantity<>(len2, LengthUnit.INCH);

        demonstrateEquality(l1, l2);
        demonstrateConversion(l1, LengthUnit.INCH);
        demonstrateAddition(l1, l2, LengthUnit.FEET);

        System.out.println("Enter weight value 1:");
        double wt1 = sc.nextDouble();

        System.out.println("Enter weight value 2:");
        double wt2 = sc.nextDouble();

        Quantity<WeightUnit> w1 =
                new Quantity<>(wt1, WeightUnit.KILOGRAM);

        Quantity<WeightUnit> w2 =
                new Quantity<>(wt2, WeightUnit.GRAM);

        demonstrateEquality(w1, w2);
        demonstrateConversion(w1, WeightUnit.GRAM);
        demonstrateAddition(w1, w2, WeightUnit.KILOGRAM);

        System.out.println("Enter volume value 1:");
        double vol1 = sc.nextDouble();

        System.out.println("Enter volume value 2:");
        double vol2 = sc.nextDouble();

        Quantity<VolumeUnit> v1 =
                new Quantity<>(vol1, VolumeUnit.LITRE);

        Quantity<VolumeUnit> v2 =
                new Quantity<>(vol2, VolumeUnit.MILLILITRE);

        demonstrateEquality(v1, v2);

        System.out.println("Subtract: " + l1.subtract(l2));

        System.out.println("Divide: "
                + l1.divide(new Quantity<>(2.0, LengthUnit.FEET)));

        Quantity<WeightUnit> w5 =
                new Quantity<>(10.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w8 =
                new Quantity<>(5.0, WeightUnit.KILOGRAM);

        System.out.println("Weight division: "
                + w5.divide(w8));

        sc.close();
    }
}