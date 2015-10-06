package de.oth.pg2_4.aufgabe_2;

public class MyCustomNumber extends Number{

	private double value;
	
	public MyCustomNumber(double value){
		this.value = value;
	}
	
	
	public double getSquare(){
		return value * value;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int) value;
	}


	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long) value;
	}


	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float) value;
	}


	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return (double) value;
	}
}
