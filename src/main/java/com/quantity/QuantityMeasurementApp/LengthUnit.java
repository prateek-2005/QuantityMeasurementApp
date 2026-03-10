package com.quantity.QuantityMeasurementApp;
public enum LengthUnit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.393701);

    private final double toInchFactor;

    LengthUnit(double toInchFactor) {
        this.toInchFactor = toInchFactor;
    }

    public double toBase(double value) {
        return value * toInchFactor;
    }

    public double fromBase(double inchValue) {
        return inchValue / toInchFactor;
    }

    public double convert(double value, LengthUnit targetUnit) {

        double inchValue = this.toBase(value);

        return targetUnit.fromBase(inchValue);
    }
}