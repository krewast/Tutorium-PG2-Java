package de.oth.pg2_5.aufgabe_3;

import de.oth.pg2_5.aufgabe_2.IHasName;

public abstract class Vogel implements IHasName {

	public abstract void singen();
	
	public Vogel(String name){
		this.name = name;
	}
	
	public String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.sayHello + " "
				+ this.getClass().getSimpleName()
				+ " " + this.name;
	}
}
