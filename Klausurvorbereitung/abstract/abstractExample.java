public abstract class Fahrzeug {
  protected int geschwindigkeit;

  // beschleunigen und bremsen ist bei jedem Fahrzeug anders
  public abstract void beschleunigen();
  public abstract void bremsen();

  // jeder hält gleich an
  public void anhalten() {
    while (geschwindigkeit > 0) {
      bremsen();
    }
  }
  
  public int getGeschwindigkeit() {
    return geschwindigkeit;
  }

}
