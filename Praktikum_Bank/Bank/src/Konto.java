public class Konto {
    private String inhaber;
    private int kontostandInRappen;
    private static int MAXKONTOSTAND = 100000*100;
    protected int MINKONTOSTAND = 0;


    public Konto(String name, int anfangsStand) {
        this.inhaber = name;
        this.kontostandInRappen = frankeninRappen(anfangsStand);

    }
    public Konto(int anfangsStand){
        this.kontostandInRappen = frankeninRappen(anfangsStand);


    }

    public String getInhaber() {
        return inhaber;
    }

    public int getKontostand() {
        return rappenInFranken(kontostandInRappen);
    }

    public void einzahlen(int betragZumeinzahlen) {
        int betragInRappen= frankeninRappen(betragZumeinzahlen);
        if (betragInRappen > 0) {

            if (kontostandInRappen + betragInRappen <= MAXKONTOSTAND) {
                kontostandInRappen += betragInRappen;
            } else {
                kontostandInRappen = MAXKONTOSTAND;
            }
        }
        System.out.println(infoAusgeben());
    }

    public void abheben(int betragZumAbheben) {
        int betragInRappen = frankeninRappen(betragZumAbheben);
        if (betragInRappen > 0) {
            if (kontostandInRappen - betragInRappen >= MINKONTOSTAND) {
                kontostandInRappen -= betragInRappen;
            } else {
                kontostandInRappen = MINKONTOSTAND;
            }
        }
        System.out.println(infoAusgeben());
    }
protected int frankeninRappen(int frankenbetrag){
        return frankenbetrag*100;

}

protected int rappenInFranken(int rappenbetrag){
        return rappenbetrag/100;
}

protected String infoAusgeben(){

    return "Inhaber: " + inhaber + ", Kontostand: " + (double) rappenInFranken(kontostandInRappen);
}

}
