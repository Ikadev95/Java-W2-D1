package esercizi.esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ContoOnLine conto = new ContoOnLine ("Fede", 29,20);
        conto.stampaSaldo();
        try {
            conto.preleva(10);
            conto.stampaSaldo();
            conto.preleva(30);
        } catch (BancaExeption e) {
           LOGGER.error(e.getMessage());
        }
        System.out.println("Operazioni completate. Controlla i log per eventuali errori.");
    }
}
