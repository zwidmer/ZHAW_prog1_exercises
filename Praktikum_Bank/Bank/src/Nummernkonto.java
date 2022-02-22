public class Nummernkonto extends Konto {
    private static Integer KONTONUMMER = 1000;

    public Nummernkonto(int anfangsBetrag) {
        super(anfangsBetrag);

        System.out.println(infoAusgeben());
        this.KONTONUMMER += 1;
    }

    protected String infoAusgeben() {
        StringBuilder infobuilder = new StringBuilder();

        infobuilder.append("Inhaber: ").append(KONTONUMMER).append(", Kontostand: ").append((double) getKontostand());
        return infobuilder.toString();
    }

}
