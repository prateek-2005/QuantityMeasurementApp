package com.quantity.QuantityMeasurementApp;
public enum WeightUnit implements Unit {

    GRAM(1.0),
    KILOGRAM(1000.0),
    POUND(453.592);

    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double base) {
        return base / factor;
    }
}