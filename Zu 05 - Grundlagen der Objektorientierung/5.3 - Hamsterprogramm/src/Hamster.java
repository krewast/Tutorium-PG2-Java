package de.oth.pg2.hamster;

public class Hamster extends FieldObject {

    private String _name;
    private int _x;
    private int _y;
    private EmptyField _field = new EmptyField(' ');
    private int _cornAmount = 0;

    public Hamster(char symbol, String name, int x, int y) {
        super(symbol);
        this._x = x;
        this._y = y;
        this._name = name;
    }
    
    // setter
    public void setX(int x) {
        this._x = x;
    }
    
    public void setY(int y) {
        this._y = y;
    }
    
    public void setName(String name) {
        this._name = name;
    }
    
    public void setCornAmount(int cornAmount) {
        this._cornAmount = cornAmount;
    }

    
    // getter
    public int getX() {
        return this._x;
    }
    
    public int getY() {
        return this._y;
    }
    
    public String getName() {
        return this._name;
    }
    
    public int getCornAmount() {
        return this._cornAmount;
    }
    
    // operations
    
    public void left() {
        switch (this.getSymbol()) {
        case '<':
            this.setSymbol('v');
            break;
        case 'v':
            this.setSymbol('>');
            break;
        case '>':
            this.setSymbol('^');
            break;
        case '^':
            this.setSymbol('<');
            break;
        }
    }

    public void right() {
        switch (this.getSymbol()) {
        case '<':
            this.setSymbol('^');
            break;
        case 'v':
            this.setSymbol('<');
            break;
        case '>':
            this.setSymbol('v');
            break;
        case '^':
            this.setSymbol('>');
            break;
        }
    }

    public FieldObject[][] goForward(FieldObject[][] field) {
        int newX = 0;
        int newY = 0;

        // move the position of the coordinates
        if (this.getSymbol() == '>') {
            newX = this.getX();
            newY = this.getY() + 1;
        } else if (this.getSymbol() == 'v') {
            newX = this.getX() + 1;
            newY = this.getY();
        } else if (this.getSymbol() == '<') {
            newX = this.getX();
            newY = this.getY() - 1;
        } else if (this.getSymbol() == '^') {
            newX = this.getX() - 1;
            newY = this.getY();
        }

        if (field[newX][newY].getClass().equals(Wall.class)) {
            System.out.println("Achtung Wand");
        } else {
            if (field[newX][newY].getClass().equals(Corn.class)) {
                System.out.println("Fresse Korn");
                this._cornAmount++;
            }
            
            field[this.getX()][this.getY()] = this._field;
            field[newX][newY] = this;
            this.setX(newX);
            this.setY(newY);
        }

        return field;
    }
}
