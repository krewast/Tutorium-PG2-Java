package de.oth.pg2_6.aufgabe_1;

public abstract class GeoObject implements ICalculate {

    private double x;
    private double y;

    public GeoObject(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
