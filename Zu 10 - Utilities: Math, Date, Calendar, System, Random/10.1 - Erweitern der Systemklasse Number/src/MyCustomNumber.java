package de.oth.pg2_4.aufgabe_2;

public class MyCustomNumber extends Number {

    private double _value;

    public MyCustomNumber(double value) {
        this._value = value;
    }

    public double getSquare() {
        return this._value * this._value;
    }

    @Override
    public int intValue() {
        return (int) this._value;
    }

    @Override
    public long longValue() {
        return (long) this._value;
    }

    @Override
    public float floatValue() {
        return (float) this._value;
    }

    @Override
    public double doubleValue() {
        return (double) this._value;
    }
}
