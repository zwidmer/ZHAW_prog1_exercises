package Aufgabe4;

public abstract class Heissgetränk extends Trinkbar {

    public final void bereiteZu(){

        kocheWasser();
        braue();
        giesseInTasse();
        fuegeZutatenHinzu();
    }

    private void kocheWasser() {
        System.out.println("koche Wasser");
    }

    private void giesseInTasse(){
        System.out.println("giesse in Tasse");
    }

    abstract void braue();
    abstract void fuegeZutatenHinzu();

}