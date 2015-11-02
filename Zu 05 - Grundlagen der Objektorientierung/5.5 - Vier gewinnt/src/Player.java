package de.oth.pg2.viergewinnt;

import java.util.HashMap;
import java.util.Map;

public class Player {

	private static Map<Chip, Player> players = new HashMap<>();

	private String _name;
	private Chip _chip;
	private Field  _field;

	//constructor
	public Player(String name, Chip chip) {
		this._name  = name;
		this._chip  = chip;

		players.put(chip, this);
	}

	public void setField(Field field) {
		this._field = field;
	}

	//places the Chip of the Player in the lowest unused Slot of Column[columnId] and returns true if successful
	public boolean placeChip(int columnId) {
		Column target = field.getColumns()[columnId];
		return target.putChip(chip);
	}

	public static Player findByChip(Chip chip) {
		return players.get(chip);
	}

	//getters
	public String getName() {
		return name;
	}
	public Chip getChip() {
		return chip;
	}
}
