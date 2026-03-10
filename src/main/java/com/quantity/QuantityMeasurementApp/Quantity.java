package com.quantity.QuantityMeasurementApp;
public class Quantity<U extends Unit> {

    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public double convertTo(U target) {
        double base = unit.toBase(value);
        return target.fromBase(base);
    }

    public double add(Quantity<U> other, U target) {
        double first = unit.toBase(value);
        double second = other.unit.toBase(other.value);
        double total = first + second;
        return target.fromBase(total);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity<?> other = (Quantity<?>) obj;

        double a = unit.toBase(value);
        double b = other.unit.toBase(other.value);

        return Double.compare(a, b) == 0;
    }
}