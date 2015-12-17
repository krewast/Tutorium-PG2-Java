public class SubClass extends SuperClass {

  /*
   * SuperClass -> SubClass
   */

  // Konstruktor ohne Parameter
  public SubClass() {
    super(); // rufe Vaterkonstruktor ohne Parameter auf

    /* Vaterkonstruktor (also Konstruktor der Klasse 'SuperClass')
     * ist das gleiche wie der folgende Aufruf (normale Instanz der Klasse)
     */
    SuperClass test = new SuperClass();
  }

  // Konstruktor mit einem Parameter, welcher in den Vaterkonstruktor gegeben wird
  public SubClass(int i) {
    super(i);
  }

  @Override
  public boolean equals(Object o) {
    // do something...
    return true;
  }

  public boolean superEquals(Object o) {
    // do something...
    super.equals(o);
  }

}
