package com.quantity.QuantityMeasurementApp;
import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first quantity value:");
        double value1 = scanner.nextDouble();

        System.out.println("Choose unit for first quantity (1-LITRE, 2-MILLILITRE, 3-GALLON):");
        int unitChoice1 = scanner.nextInt();

        VolumeUnit unit1 = null;

        if(unitChoice1 == 1) unit1 = VolumeUnit.LITRE;
        if(unitChoice1 == 2) unit1 = VolumeUnit.MILLILITRE;
        if(unitChoice1 == 3) unit1 = VolumeUnit.GALLON;

        Quantity<VolumeUnit> quantity1 = new Quantity<>(value1, unit1);

        System.out.println("Enter second quantity value:");
        double value2 = scanner.nextDouble();

        System.out.println("Choose unit for second quantity (1-LITRE, 2-MILLILITRE, 3-GALLON):");
        int unitChoice2 = scanner.nextInt();

        VolumeUnit unit2 = null;

        if(unitChoice2 == 1) unit2 = VolumeUnit.LITRE;
        if(unitChoice2 == 2) unit2 = VolumeUnit.MILLILITRE;
        if(unitChoice2 == 3) unit2 = VolumeUnit.GALLON;

        Quantity<VolumeUnit> quantity2 = new Quantity<>(value2, unit2);

        System.out.println("Are quantities equal : " + quantity1.equals(quantity2));

        System.out.println("Choose result unit (1-LITRE, 2-MILLILITRE, 3-GALLON):");
        int resultChoice = scanner.nextInt();

        VolumeUnit resultUnit = null;

        if(resultChoice == 1) resultUnit = VolumeUnit.LITRE;
        if(resultChoice == 2) resultUnit = VolumeUnit.MILLILITRE;
        if(resultChoice == 3) resultUnit = VolumeUnit.GALLON;

        Quantity<VolumeUnit> result = quantity1.add(quantity2, resultUnit);

        System.out.println("Addition Result : " + result);

        scanner.close();
    }
}
