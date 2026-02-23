package com.quantity.UnittoUnitConversion;
public class Length {

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double toBaseUnit() {
        return unit.toBaseUnit(value);
    }

    public double convertTo(LengthUnit targetUnit) {
        double inchValue = this.toBaseUnit();
        return targetUnit.fromBaseUnit(inchValue);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;

        return Double.compare(this.toBaseUnit(), other.toBaseUnit()) == 0;
    }
}