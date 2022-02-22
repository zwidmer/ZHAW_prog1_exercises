/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author tebe
 * @version 1.0
 */
public enum Befehlswort {
    GEHE("gehe"),
    UNBEKANNT("?"),
    HILFE("hilfe"),
    BEENDEN("beenden"),
    UMSEHEN("umsehen"),
    UEBERNIMM("uebernimm"),
    NIMM("nimm");
    String befehl;


    /**
     * Konstruktor - initialisiere die Befehlswörter.
     */
    private Befehlswort(String befehl) {
        this.befehl = befehl;

    }


    public String getBefehl() {
        return befehl;
    }

    public static Befehlswort gibBefehlswort(String wort) {


        switch (wort) {
            case "gehe":
                return GEHE;
            case "hilfe":
                return HILFE;
            case "beenden":
                return BEENDEN;
            case "umsehen":
                return UMSEHEN;
            case "uebernimm":
                return UEBERNIMM;
            case "nimm":
                return NIMM;

            default:
                return UNBEKANNT;

        }
    }

    public static String gibBefehlsworteAlsText() {
        Befehlswort[] befehlsworte = Befehlswort.values();
        StringBuilder befehlsworteAlsString = new StringBuilder();
        for (Befehlswort befehl : befehlsworte) {
            befehlsworteAlsString.append(befehl).append(" ");
        }
        return befehlsworteAlsString.toString();

    }


}
