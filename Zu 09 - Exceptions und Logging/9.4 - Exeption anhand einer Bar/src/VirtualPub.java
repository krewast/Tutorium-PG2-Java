package de.oth.pg2.virtualBar;

public class VirtualPub {

	int storage;

	public VirtualPub(int storage) {
		this.storage = storage;
	}

	public void serveCustomer(Person custumer, Drink drink)
			throws TooColdException, TooHotException, StorageEmpty {

		if (storage >= 1) {
			// Alles Prima, Getränke wurde bestellt und zum Kunden gebracht
			storage --;
			System.out.println("Neuer Vorrat: " + storage);

			custumer.drink(drink);

		} else {
			// Vorrat reicht nicht mehr aus, und eine Fehlermeldung wird geworfen
			throw new StorageEmpty();
		}
	}

}
