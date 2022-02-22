package Aufgabe4;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Aufgabe3.Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee extends Heissgetränk {



  protected void braue(){
    System.out.println("Teebeutel eintauchen");
  }

  protected void fuegeZutatenHinzu(){
    System.out.println("Zitrone dazu");
  }

  @Override
  public void trinke() {

  }

  // Weitere Metoden
}
