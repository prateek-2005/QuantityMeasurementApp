package com.quantity.QuantityMeasurementApp;
public enum LengthUnit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.393701);

    private final double conversionFactorToInch;

    LengthUnit(double conversionFactorToInch) {
        this.conversionFactorToInch = conversionFactorToInch;
    }

    public double toBaseUnit(double value) {
        return value * conversionFactorToInch;
    }

    public double fromBaseUnit(double inchValue) {
        return inchValue / conversionFactorToInch;
    }
}