package com.quantity.QuantityMeasurementApp;
public enum LengthUnit implements Unit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.393701);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double base) {
        return base / factor;
    }
}