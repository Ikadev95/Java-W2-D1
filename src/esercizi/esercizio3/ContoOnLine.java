package esercizi.esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
            super(titolare, saldo);
            this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
            System.out.println("Titolare:" + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
+ "- Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }
    public void preleva(double x) throws BancaExeption {
        if(x > maxPrelievo) throw new BancaExeption("il prelievo non è disponibile");
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
