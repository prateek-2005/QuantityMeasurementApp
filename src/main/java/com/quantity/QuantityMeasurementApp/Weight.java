package com.quantity.QuantityMeasurementApp;
public class Weight {

    private final double value;
    private final WeightUnit unit;

    public Weight(double value, WeightUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double convertTo(WeightUnit target) {
        return unit.convert(value, target);
    }

    public double add(Weight other, WeightUnit target) {
        double first = unit.toBase(value);
        double second = other.unit.toBase(other.value);
        double total = first + second;
        return target.fromBase(total);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Weight other = (Weight) obj;
        double a = unit.toBase(value);
        double b = other.unit.toBase(other.value);
        return Double.compare(a, b) == 0;
    }
}