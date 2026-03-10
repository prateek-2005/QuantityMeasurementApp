package com.quantity.QuantityMeasurementApp;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public double addLengths(double v1, LengthUnit u1, double v2, LengthUnit u2, LengthUnit target) {
        Length l1 = new Length(v1, u1);
        Length l2 = new Length(v2, u2);
        return l1.add(l2, target);
    }

    public double addWeights(double v1, WeightUnit u1, double v2, WeightUnit u2, WeightUnit target) {
        Weight w1 = new Weight(v1, u1);
        Weight w2 = new Weight(v2, u2);
        return w1.add(w2, target);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        int type = sc.nextInt();

        if (type == 1) {

            double v1 = sc.nextDouble();
            LengthUnit u1 = LengthUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            LengthUnit u2 = LengthUnit.valueOf(sc.next().toUpperCase());

            LengthUnit target = LengthUnit.valueOf(sc.next().toUpperCase());

            double result = app.addLengths(v1, u1, v2, u2, target);

            System.out.println(result + " " + target);
        }

        else if (type == 2) {

            double v1 = sc.nextDouble();
            WeightUnit u1 = WeightUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            WeightUnit u2 = WeightUnit.valueOf(sc.next().toUpperCase());

            WeightUnit target = WeightUnit.valueOf(sc.next().toUpperCase());

            double result = app.addWeights(v1, u1, v2, u2, target);

            System.out.println(result + " " + target);
        }

        sc.close();
    }
}