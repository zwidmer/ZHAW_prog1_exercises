package Aufgabe3;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Aufgabe3.Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee extends Heissgetränk {

  /**
   * Bereitet einen Aufgabe3.Tee zu.
   */
  public void bereiteZu() {
    super.bereiteZu();
    taucheTeebeutel();
    giesseInTasse();
    fuegeZitroneHinzu();
  }

  private void taucheTeebeutel(){
    System.out.println("Teebeutel eintauchen");
  }

  private void fuegeZitroneHinzu(){
    System.out.println("Zitrone dazu");
  }

  // Weitere Metoden
}
