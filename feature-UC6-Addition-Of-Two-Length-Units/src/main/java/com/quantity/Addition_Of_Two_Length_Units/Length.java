package com.quantity.Addition_Of_Two_Length_Units;
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

    public double add(Length other, LengthUnit targetUnit) {

        double thisInch = this.toBaseUnit();
        double otherInch = other.toBaseUnit();

        double totalInch = thisInch + otherInch;

        return targetUnit.fromBaseUnit(totalInch);
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