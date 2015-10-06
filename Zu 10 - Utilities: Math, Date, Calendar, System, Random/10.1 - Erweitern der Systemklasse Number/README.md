#10.1 - Erweitern der Systemklasse Number

Erweitern der Systemklasse Number zur Klasse MyCustomNumber.

Der Konstruktor der Klasse soll wie folgt aussehen:

    public MyCustomNumber(double value);

Dabei sollen die geerbten Klassen die richtigen Datenwerte und –typen zurückgeben:

    public double doubleValue()
    public float floatValue()
    public int intValue()
    public long longValue()

Es soll eine zusätzliche Funktion implementiert werden:

- Funktionsname: getSquare() (public)
- Rückgabewert: double
- Aufgabe: Den Wert in der Klasse quadriert zurückgeben.

Beispielcode:

    MyCustomNumber number = new MyCustomNumber(10);
    System.out.println(number.getSquare());

**Ausgabe:** „100"