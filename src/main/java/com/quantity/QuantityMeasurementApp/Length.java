package com.quantity.QuantityMeasurementApp;
public class Length {

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double convertTo(LengthUnit target) {
        return unit.convert(value, target);
    }

    public double add(Length other, LengthUnit target) {
        double first = unit.toBase(value);
        double second = other.unit.toBase(other.value);
        double total = first + second;
        return target.fromBase(total);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;
        double a = unit.toBase(value);
        double b = other.unit.toBase(other.value);
        return Double.compare(a, b) == 0;
    }
}