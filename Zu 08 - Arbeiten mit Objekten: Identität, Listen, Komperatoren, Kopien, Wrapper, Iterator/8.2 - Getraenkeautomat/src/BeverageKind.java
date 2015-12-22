// Dieses Enum sieht anders aus, als die bisher verwendeten oder in der Vorlesung gezeigten.
// Trotzdem handelt es sich immer noch um ein ganz normales Enum, die Dokumentation dazu findet sich hier:
// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

public enum BeverageKind {  // Sorte des Getränks

    COLA(1, "Cola", 80),
    LEMONADE(2, "Limo", 70),
    WATER(3, "Wasser", 60);
    
    private final int _identifier;
    private final String _description;
    private final int _priceInEuroCents;
    
    // Kein vorangestelltes public, private oder protected erlaubt!
    BeverageKind(int identifier, String description, int priceInEuroCents) {
        this._identifier = identifier;
        this._description = description;
        this._priceInEuroCents = priceInEuroCents;
    }

    public int getIdentifier() {
        return this._identifier;
    }

    public String getDescription() {
        return this._description;
    }
    
    public int getPriceInEuroCents() {
        return this._priceInEuroCents;
    }

    public String toString() {
        return getIdentifier() + ": " + getDescription() + " [" + getPriceInEuroCents() + " Cent]";
    }
}
