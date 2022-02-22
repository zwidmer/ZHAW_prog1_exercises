public class Bank {

    public static void main(String[]args){
        Konto konto = new Konto("Zoe Widmer", 1000);
        Salaerkonto salaerkonto = new Salaerkonto("Hannes Meier", 5000);
        Nummernkonto nummernkonto = new Nummernkonto(2000);
        Nummernkonto nummernkonto2= new Nummernkonto(2001);
        Nummernkonto nummernkonto3 = new Nummernkonto(2002);

        konto.abheben(1100);
        konto.einzahlen(500);
        salaerkonto.abheben(6000);
        salaerkonto.einzahlen(300);
        nummernkonto.abheben(2500);

    }

}
