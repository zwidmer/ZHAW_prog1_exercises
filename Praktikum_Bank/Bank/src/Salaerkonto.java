public class Salaerkonto extends Konto {

    public Salaerkonto(String name, int anfangsbetrag) {
        super(name, anfangsbetrag);
    this.MINKONTOSTAND = -10000*100;

    }

    public int getUeberzugslimite() {
        this.MINKONTOSTAND = -10000;
        return MINKONTOSTAND;
    }


    protected String infoAusgeben() {

        StringBuilder infobuilder = new StringBuilder();
        infobuilder.append(super.infoAusgeben()).append(", Ueberzugslimite: ").append((double)getUeberzugslimite());

        return infobuilder.toString();
    }

}
