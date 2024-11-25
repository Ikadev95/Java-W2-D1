package esercizi.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kmAlLitro = 0;

        while (true) {
            try {
                System.out.println("inserisci il numero di km percorsi");
                double km = scanner.nextDouble();
                if (km < 1) {
                    LOGGER.error("Numero di km non valido");
                    continue;
                }
                System.out.println("inserisci i litri di carburante consumati");
                double litri = scanner.nextDouble();
                if (litri < 1) {
                    LOGGER.error("Numero di litri non valido");
                    continue;
                }
                kmAlLitro = km / litri;
                break;

            } catch (Exception e) {
                LOGGER.error("errore durante l'inserimento dei dati");
                scanner.nextLine();
            }
        }

        System.out.println("I km/litro sono: " + kmAlLitro);

    }
}
