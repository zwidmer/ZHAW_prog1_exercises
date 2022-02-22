package Aufgabe3;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Aufgabe3.Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee extends Heissgetränk {

  /**
   * Bereitet einen Aufgabe3.Kaffee zu.
   */
  public void bereiteZu() {
    super.bereiteZu();
    braueFilterKaffee();
    giesseInTasse();
    fuegeZuckerUndMilchHinzu();
  }


  private void braueFilterKaffee(){
    System.out.println( "brauen");
  }


  private void fuegeZuckerUndMilchHinzu(){
    System.out.println("Zucker und Milch dazugegeben");
  }
  // Weitere Methoden
}
