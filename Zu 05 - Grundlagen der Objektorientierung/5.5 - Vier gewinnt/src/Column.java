package de.oth.pg2.viergewinnt;

public class Column {

    public static final int HEIGHT = 6;

    private Chip[] _slots;
    private int _counter;

    // constructor
    public Column() {
        this._counter = 0;
        this._slots = new Chip[HEIGHT];
    }

    // drops a chip into the column and returns true if successful
    public boolean putChip(Chip chip) {
        if (isFull()) {
            System.out.println("Diese Spalte ist bereits voll. Bitte eine andere wählen!");
            return false;
        }

        this._slots[counter++] = chip;
        return true;
    }

    // checks the input Column if it´s already full
    public boolean isFull() {
        if (this._counter == HEIGHT) {
            return true;
        }
        return false;
    }

    // getters
    public Chip[] getSlots() {
        return slots;
    }

    public int getCounter() {
        return counter;
    }
}
