public class SubSubClass extends SubClass {

  /*
   * SuperClass -> SubClass -> SubSubClass
   */

  // Konstruktor ohne Parameter
  public SubSubClass() {
    super(); // rufe Vaterkonstruktor ohne Parameter auf

    /*
     * Durch den Aufruf 'super()' wird der Konstruktor der SubClass aufgerufen,
     * welcher aber den Konstruktor der SuperClass aufruft.
     * d.h. SubSubClass Konstruktor -> SubClass Konstruktor -> SuperClass Konstruktor
     */
  }

  /*
   * Da SubSubClass von SubClass und somit auch von SuperClass erbt,
   * habt ihr beim Implementieren des equals von SubSubClass drei Möglichkeiten:
   * 1- equals von SubSubClass ->equals(Object o)
   * 2- equals von SubClass -> superEquals(Object o)
   * 3- equals von SuperClass -> superSuperEquals(Object o)
   */

  @Override
  public boolean equals(Object o) {
    // do something...
    return true;
  }

  public boolean superEquals(Object o) {
    // equals von SubClass
    super.equals(o);
  }

  public boolean superSuperEquals(Object o) {
    // superEquals von SubClass, also equals von SuperClass
    super.superEquals(o);
  }

}
