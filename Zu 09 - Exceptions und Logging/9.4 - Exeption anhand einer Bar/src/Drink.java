package de.oth.pg2.virtualBar;

public class Drink {
	//Die perfekte Temperatur für ein kaltes Getränk
    private int perfektTemperature = 8;
    //Die aktuelle Temperatur des Getränkes
    private int actTemperature;
    public Drink(int temperature) {
    	this.setActTemperature(temperature);
	}
	public int getActTemperature() {
		return actTemperature;
	}
	public void setActTemperature(int actTemperature) {
		this.actTemperature = actTemperature;
	}
	public int getPerfektTemperature() {
		return perfektTemperature;
	}
	public void setPerfektTemperature(int perfektTemperature) {
		this.perfektTemperature = perfektTemperature;
	}
}
