package oth.pg2;
public class Color {

    private int _red;
    private int _green;
    private int _blue;

    public int getRed() {
        return this._red;
    }

    public void setRed(int value) {
        this._red = value;
    }

    public int getGreen() {
        return this._green;
    }

    public void setGreen(int value) {
        this._green = value;
    }

    public int getBlue() {
        return this._blue;
    }

    public void setBlue(int value) {
        this._blue = value;
    }

    public String toString() {
        // format the string to the rgb color format
        return String.format("#%02X%02X%02X", getRed(), getGreen(), getBlue());
    }

}
