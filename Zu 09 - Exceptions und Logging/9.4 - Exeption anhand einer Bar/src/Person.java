package de.oth.pg2.virtualBar;

public class Person {

	public void drink(Drink drink) throws TooColdException, TooHotException {

		if (drink.getActTemperature() < drink.getPerfektTemperature() - 2) {
			throw new TooColdException();
		} else if (drink.getActTemperature() > drink.getPerfektTemperature() + 2) {
			throw new TooHotException();
		}
	}

}
