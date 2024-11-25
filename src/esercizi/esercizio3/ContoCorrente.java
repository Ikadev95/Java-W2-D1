package esercizi.esercizio3;

public class ContoCorrente {

    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
            this.titolare = titolare;
            this.saldo = saldo;
            this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaExeption {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        if(saldo < 0) throw new BancaExeption("il conto è in rosso");
        nMovimenti++;
    }
        public double restituisciSaldo() {
        return saldo;
    }
}
