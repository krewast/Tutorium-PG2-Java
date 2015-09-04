package de.oth.pg2.qis;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private int credit;
	private int multiplier;
	private String name;
	private double note;
	

	public String getCourseData() {
		return  "  Name: " + name + "\n" +
				"  Credit: " + credit + "\n" +
				"  Multiplikator: " + multiplier + "\n" +
				"  Note: " + String.format("%10.2f", note) + "\n";
	}
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean setNote(double note) {

		List<Double> availableNotes = new ArrayList<Double>();
		availableNotes.add(1.0);
		availableNotes.add(1.3);
		availableNotes.add(1.7);
		availableNotes.add(2.0);
		availableNotes.add(2.3);
		availableNotes.add(2.7);
		availableNotes.add(3.0);
		availableNotes.add(3.3);
		availableNotes.add(3.7);
		availableNotes.add(4.0);
		availableNotes.add(5.0);
		
		if (availableNotes.contains(note)){
			this.note = note;
			return true;
		}
		System.err.println("Bitte geben Sie ein gültigen Wert ein!");
		return false;
	}

	public double getNote() {
		return note;
	}
	
	
}
