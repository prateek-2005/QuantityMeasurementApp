package com.quantity.QuantityMeasurementApp;
public class Length {

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public double convertTo(LengthUnit targetUnit) {
        return unit.convert(value, targetUnit);
    }

    public double add(Length other, LengthUnit targetUnit) {

        double first = unit.toBase(value);
        double second = other.unit.toBase(other.value);

        double totalInch = first + second;

        return targetUnit.fromBase(totalInch);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;

        double thisBase = unit.toBase(value);
        double otherBase = other.unit.toBase(other.value);

        return Double.compare(thisBase, otherBase) == 0;
    }
}