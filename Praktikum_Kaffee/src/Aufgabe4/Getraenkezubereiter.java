package Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Getraenkezubereiter {

    private final List<Heissgetränk> getraenke;

    public Getraenkezubereiter(){
        getraenke = new ArrayList<>();
        getraenke.add(new Kaffee());
        getraenke.add(new Tee());
        getraenke.add(new Tee());
        getraenke.add(new Kaffee());
        getraenke.add(new Tee());
    }

    public void getraenkeZubereiten(){
        for(Heissgetränk getraenk: getraenke){
            getraenk.bereiteZu();
            getraenk.trinke();
        }
    }
    public static void main(String[]args){
    Getraenkezubereiter zubereiter = new Getraenkezubereiter();
    zubereiter.getraenkeZubereiten();
    }
}
