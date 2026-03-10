package com.quantity.QuantityMeasurementApp;
public interface Unit {
    double toBase(double value);
    double fromBase(double base);
}