// search for #learnmore if you want to learn some java tricks!

import java.util.ArrayList;
import java.util.List;

/*
 * This class called 'Class' manages the class. It holds the
 * values 'credit' (e.g. 2), multiplier (e.g. 3), name (e.g. PG2) and grade.
 * (e.g. 1.3)
 */
public class Class {

	// #learnmore naming convention: class variables with underscore _
	private int _credits;
	private int _multiplier;
	private String _name;
	private double _grade;
	
	// setter
	public void setCredits(int credits) {
		this._credits = credits;
	}

	public void setMultiplier(int multiplier) {
		this._multiplier = multiplier;
	}

	public void setName(String name) {
		this._name = name;
	}

	public void setGrade(double grade) {
		this._grade = grade;
	}

	// getter
	public int getCredits() {
		return this._credits;
	}

	public int getMultiplier() {
		return this._multiplier;
	}

	public String getName() {
		return this._name;
	}

	public double getGrade() {
		return this._grade;
	}

	public String getClassData() {
		return  "  Name: " + this._name + "\n" +
			"  Credit: " + this._credits + "\n" +
			"  Multiplikator: " + this._multiplier + "\n" +
			"  Grade: " + String.format("%10.2f", this._grade) + "\n";
	}
}
