package de.oth.pg2.viergewinnt;

public class Field {

    private static final int WIDTH = 7;

    private Column[] _columns;

    // constructor
    public Field() {
        this._columns = new Column[WIDTH];
        for (int i = 0; i < _columns.length; i++) {
            _columns[i] = new Column();
        }
    }

    // prints the current field state
    public void print() {
        printHeader();

        for (int countLines = Column.HEIGHT - 1; countLines >= 0; countLines--) {
            System.out.print('|');
            for (int countColumns = 0; countColumns < Field.WIDTH; countColumns++) {
                Chip toPrint = columns[countColumns].getSlots()[countLines];
                System.out.print((toPrint == null ? " " : toPrint) + "|");
            }
            System.out.print('\n');
        }

        printFooter();
    }

    // prints the header line
    private void printHeader() {
        System.out.print("|");
        for (int i = 0; i < WIDTH; i++) {
            System.out.print((i + 1) + "|");
        }
        System.out.print("\n");
        for (int i = 0; i < WIDTH * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    // prints the field footer
    private void printFooter() {
        for (int i = 0; i < WIDTH * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    // getter
    public Column[] getColumns() {
        return this._columns;
    }

    /********************************************************************************************
     * winner check methods from here - not fully implemented, just for
     * demonstration *
     ********************************************************************************************/

    // checks the field for a winner chip using the following methods:
    // checkVertical(), checkHorizontal(), checkDiagonalUp(),
    // checkDiagonalDown()
    // returns the winner´s chip
    public Chip check() {
        Chip checkChip;

        // check every column for 4 equal vertical chips
        checkChip = checkVertical();
        if (checkChip != null) {
            return checkChip;
        }

        // check every line for 4 equal horizontal chips
        checkChip = checkHorizontal();
        if (checkChip != null) {
            return checkChip;
        }

        // diagonal line of 4 equal chips
        checkChip = checkDiagonalUp();
        if (checkChip != null) {
            return checkChip;
        }

        checkChip = checkDiagonalDown();
        if (checkChip != null) {
            return checkChip;
        }

        // if method reaches this point, there´s no winner yet
        return null;
    }

    // checks each column (vertical) for winner and returns the winning chip or
    // null
    private Chip checkVertical() {
        // not implemented here
        return null;
    }

    // checks the field for winner by horizontal 4 equal chips and returns the
    // winning Chip or null
    private Chip checkHorizontal() {
        // not implemented here
        return null;
    }

    // checks the field for winner by downward diagonal 4 equal chips and
    // returns the winning Chip or null
    private Chip checkDiagonalDown() {
        // not implemented here
        return null;
    }

    // checks the field for winner by upward diagonal 4 equal chips and returns
    // the winning Chip or null
    private Chip checkDiagonalUp() {
        // not implemented here
        return null;
    }
}
