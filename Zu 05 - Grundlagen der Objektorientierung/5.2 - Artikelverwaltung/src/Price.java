package oth.pg2;
public class Price {

    private double _value;
    private String _currency;

    public double getValue() {
        return this._value;
    }

    public void setValue(double value) {
        this._value = value;
    }

    public String getCurrency() {
        return this._currency;
    }

    public void setCurrency(String value) {
        this._currency = value;
    }

    /* #learnmore
     * why are we using @Override here? 
     * the function 'toString()' is defined as a Java function, however we
     * want to use it in another way. When calling 'toString()' for a Price, 
     * we want to get the value and the currency, that's why we 'override' it.
     * 
     * you've probably heard about 'override' and 'overload' -- do you know
     * what the difference is? (important for your exam!)
     */
    @Override
    public String toString() {
        return String.format("%.2f", getValue()) + " " + getCurrency();
    }

}
