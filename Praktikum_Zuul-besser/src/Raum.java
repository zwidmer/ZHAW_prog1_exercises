import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Diese Klasse modelliert Raeume in der Welt von Zuul.
 * 
 * Ein "Raum" repraesentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Raeumen ueber Ausgaenge verbunden.
 * Fuer jeden existierenden Ausgang haelt ein Raum eine Referenz auf 
 * den benachbarten Raum. In einem Raum koennen sich Personen und 
 * Gegenstaende befinden. 
 * 
 * @author  tebe (Original: Michael Koelling und David J. Barnes)
 * @version 1.0
 */

public class Raum
{
    private final String beschreibung;
	  private final ArrayList<Person> person = new ArrayList<Person>();
	  private final ArrayList<Gegenstand> gegenstand = new ArrayList<Gegenstand>();
    private final HashMap<String, Raum> ausgaenge = new HashMap<String, Raum>();

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgaenge, Personen oder Gegenstaende.
     * @param beschreibung enthaelt eine Beschreibung in der Form
     *        "in einer Kueche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung; 
    }

    /**
     * Definiere einen Ausgang fuer diesen Raum.
     * @param richtung Die Richtung, in der der Ausgang liegen soll
     * @param nachbar Der Raum, der ueber diesen Ausgang erreicht wird
     */
    public void setzeAusgang(String richtung, Raum nachbar) 
    {
        ausgaenge.put(richtung, nachbar);
    }

    /**
     * Die Person betritt den Raum und wird fortan als im Raum
     * befindlich gelistet.
     * @param person Person, welche den Raum betritt
     */
    public void betreten(Person person) 
    {
        this.person.add(person);
    }
    
    /**
     * Die Person mit der angegebenen Nummer wird aus dem Raum entfernt 
     * und wird fortan nicht mehr als im Raum befindlich gelistet.
     * Falls eine Person mit dieser Nummer nicht existiert, wird 'null' 
     * zurueckgegeben.
     * @param nummer Nummer der Person
     * @return Person, die den Raum verlassen hat
     */
    public Person verlassen(int nummer) 
    {
    	boolean ungueltigerIndex = person.isEmpty() || 
    			nummer > person.size()-1 || nummer < 0;
        return ungueltigerIndex ? null : person.remove(nummer);
    }
    
    /**
     * Der Gegenstand wird in den Raum gelegt und wird fortan als im
     * Raum befindlich gelistet. 
     * @param gegenstand Gegenstand, welcher in den Raum gelegt wird
     */
    public void hineinlegen(Gegenstand gegenstand) 
    {
        this.gegenstand.add(gegenstand);
    }   
    
    /**
     * Der Gegenstand mit der angegebenen Nummer wird aus dem Raum entfernt 
     * und wird fortan nicht mehr als im Raum befindlich gelistet.
     * Falls ein Gegenstand mit dieser Nummer nicht existiert, wird 'null' 
     * zurueckgegeben.
     * @param nummer Nummer des Gegenstands
     * @return Gegenstand, der herausgenommen wurde
     */
    public Gegenstand herausnehmen(int nummer) 
    {
    	boolean ungueltigerIndex = gegenstand.isEmpty() || 
    			nummer > gegenstand.size()-1 || nummer < 0;
        return ungueltigerIndex ? null : gegenstand.remove(nummer);
    }
    
    /**
     * @return Die kurze Beschreibung dieses Raums (die dem Konstruktor
     * uebergeben wurde).
     */
    public String gibKurzbeschreibung()
    {
        return beschreibung;
    }

    /**
     * Liefere eine lange Beschreibung dieses Raums, inkl.
     * Beschreibung des Rauminhaltes (Gegenstaende, Personen,...).
     * @return eine lange Beschreibung dieses Raumes.
     */
    public String gibLangeBeschreibung()
    {
        return "Sie sind " + beschreibung + ".\n" 
        		+ gibAusgaengeAlsString()
        		+ gibBeschreibungNamen(gibGegenstandNamenAlsString(),"Gegenstand")
        	    + gibBeschreibungNamen(gibPersonenNamenAlsString(), "Person");
    }

    private List<String> gibGegenstandNamenAlsString() {

        return  gegenstand.stream().map(Gegenstand::gibName).collect(Collectors.toList());

    }

    private List<String> gibPersonenNamenAlsString() {
        return person.stream().map(Person::gibName).collect(Collectors.toList());

    }
    
    private String gibBeschreibungNamen(List<String> namen, String objektName){
        String text = "Keine" + objektName + "im Raum.\n";
        if(namen.size()>0){
            text= objektName + " im Raum:\n";
            int counter = 0;
            for( String name : namen) {
                text += " " + counter++ + ": " + name + "\n";
            }
        }
        return text;
}

    /**
     * Liefere eine Zeichenkette, die die Ausgaenge dieses Raums
     * beschreibt, beispielsweise
     * "Ausgaenge: north west".
     * @return eine Beschreibung der Ausgaenge dieses Raumes.
     */
    private String gibAusgaengeAlsString()
    {
        String ergebnis = "Ausgaenge:";
        Set<String> keys = ausgaenge.keySet();
        for(String ausgang : keys)
            ergebnis += " " + ausgang;
        return ergebnis + "\n";
    }

    /**
     * Liefere den Raum, den wir erreichen, wenn wir aus diesem Raum
     * in die angegebene Richtung gehen. Liefere 'null', wenn in
     * dieser Richtung kein Ausgang ist.
     * @param richtung die Richtung, in die gegangen werden soll.
     * @return den Raum in der angegebenen Richtung.
     */
    public Raum gibAusgang(String richtung) 
    {
        return ausgaenge.get(richtung);
    }
}

