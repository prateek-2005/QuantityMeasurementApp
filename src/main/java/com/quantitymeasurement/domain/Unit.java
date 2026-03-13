package com.quantitymeasurement.domain;

public interface Unit {

    double toBase(double value);

    double fromBase(double base);
}