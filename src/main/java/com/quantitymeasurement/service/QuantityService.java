package com.quantitymeasurement.service;

import com.quantitymeasurement.domain.Quantity;
import com.quantitymeasurement.domain.Unit;

public class QuantityService {

    public <U extends Unit> double add(double v1, U u1, double v2, U u2, U target) {

        Quantity<U> q1 = new Quantity<>(v1, u1);

        Quantity<U> q2 = new Quantity<>(v2, u2);

        return q1.add(q2, target);
    }

    public <U extends Unit> double convert(double value, U source, U target) {

        Quantity<U> quantity = new Quantity<>(value, source);

        return quantity.convertTo(target);
    }
}