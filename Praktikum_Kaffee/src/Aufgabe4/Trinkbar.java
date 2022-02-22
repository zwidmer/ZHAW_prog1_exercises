package Aufgabe4;

public abstract class Trinkbar {

    public void trinke(){
        System.out.println("Ich trinke einen " + getClass().getSimpleName());
    }
}
