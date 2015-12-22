public class StaticExample {

  // static ohne Instanz der Klasse, zählt die Objekte mit
  public static int counter = 0;

  // NIE ohne Instanz der Klasse
  private int id;

  public int getID() {
    return this.id;
  }

  public void setID(int id) {
    this.id = id;
  }

  public static int generateID() {
    // erhöhe die STATISCHE Variable counter
    // MERKE: Statische Variablen oder Methoden werden über den KlassenNAMEN aufgerufen
    int ID = StaticClass.counter;
    StaticClass.counter = StaticClass.counter + 1;
    return ID;
  }

  public static void doSomething() {
    // in einer statischen Methode habt ihr KEIN Objekt der Klasse zur Verfügung
    // d.h. 'this' wird nicht funktionieren. Ihr könnt nur auf normale Methoden
    // zugreifen, wenn ihr ein Objekt der Klasse erstellt (verwendet man sehr selten)
    StaticClass o = new StaticClass();
    o.getID();
  }

  public StaticClass() {
    // statischer Aufruf über 'StaticClass.'
    int id = StaticClass.generateID();

    // normaler Aufruf über 'this.'
    this.setID(id)
  }

}
