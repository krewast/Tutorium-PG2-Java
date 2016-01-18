public abstract class Person {
  // eine Klasse ist erst abstrakt, wenn sie eine abstrakte Methode hat

  // eine normale Methode innerhalb einer abstrakten Klasse:
  // "was können alle Klassen gleich?"
  public void sayName(String name) {
    return "Mein Name ist " + name;
  }

  // eine abstrakte Methode innerhalb einer abstrakten Klasse:
  // "was können alle Klassen, aber jeder anders?"
  public abstract void arbeiten();

}
