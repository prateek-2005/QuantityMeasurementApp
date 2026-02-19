package com.quantity.ExtendedUnitSupport;
public enum LengthUnit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.393701);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toBaseUnit(double value) {
        return value * conversionFactor;
    }
}
