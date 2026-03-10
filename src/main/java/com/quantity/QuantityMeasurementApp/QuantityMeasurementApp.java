package com.quantity.QuantityMeasurementApp;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();

        if (type == 1) {

            double v1 = sc.nextDouble();
            LengthUnit u1 = LengthUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            LengthUnit u2 = LengthUnit.valueOf(sc.next().toUpperCase());

            LengthUnit target = LengthUnit.valueOf(sc.next().toUpperCase());

            Quantity<LengthUnit> q1 = new Quantity<>(v1, u1);
            Quantity<LengthUnit> q2 = new Quantity<>(v2, u2);

            double result = q1.add(q2, target);

            System.out.println(result + " " + target);
        }

        else if (type == 2) {

            double v1 = sc.nextDouble();
            WeightUnit u1 = WeightUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            WeightUnit u2 = WeightUnit.valueOf(sc.next().toUpperCase());

            WeightUnit target = WeightUnit.valueOf(sc.next().toUpperCase());

            Quantity<WeightUnit> q1 = new Quantity<>(v1, u1);
            Quantity<WeightUnit> q2 = new Quantity<>(v2, u2);

            double result = q1.add(q2, target);

            System.out.println(result + " " + target);
        }

        sc.close();
    }
}