package com.quantitymeasurement.presentation;

import com.quantitymeasurement.domain.LengthUnit;
import com.quantitymeasurement.domain.WeightUnit;
import com.quantitymeasurement.service.QuantityService;

import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuantityService service = new QuantityService();

        int type = sc.nextInt();

        if (type == 1) {

            double v1 = sc.nextDouble();
            LengthUnit u1 = LengthUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            LengthUnit u2 = LengthUnit.valueOf(sc.next().toUpperCase());

            LengthUnit target = LengthUnit.valueOf(sc.next().toUpperCase());

            double result = service.add(v1, u1, v2, u2, target);

            System.out.println(result + " " + target);
        }

        else if (type == 2) {

            double v1 = sc.nextDouble();
            WeightUnit u1 = WeightUnit.valueOf(sc.next().toUpperCase());

            double v2 = sc.nextDouble();
            WeightUnit u2 = WeightUnit.valueOf(sc.next().toUpperCase());

            WeightUnit target = WeightUnit.valueOf(sc.next().toUpperCase());

            double result = service.add(v1, u1, v2, u2, target);

            System.out.println(result + " " + target);
        }

        sc.close();
    }
}