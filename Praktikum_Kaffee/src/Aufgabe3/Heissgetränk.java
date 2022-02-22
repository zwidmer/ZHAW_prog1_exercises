package Aufgabe3;

public abstract class Heissgetränk {

    public void bereiteZu(){
        kocheWasser();
    }

    protected void kocheWasser() {
        System.out.println("koche Wasser");
    }

    protected void giesseInTasse(){
        System.out.println("giesse in Tasse");
    }

}