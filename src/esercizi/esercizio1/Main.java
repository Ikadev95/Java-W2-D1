package esercizi.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int [5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10) +1;
        }
        int x;
        do{
            System.out.println("inserisci un intero o ferma l'inserimento scrivendo 0:");
            try{
                x = scanner.nextInt();
                if(x == 0){
                    break;
                }
                System.out.println("inserisci la posizione (da 1 a 5):");
                int posizione = scanner.nextInt();

                if(posizione <1 || posizione > array.length){
                    LOGGER.error("posizione fuori dai limiti");
                }
                else array[posizione -1] = x;
                System.out.println("array aggiornato");
            } catch (Exception e) {
                LOGGER.error("errore di input",e);
                scanner.nextLine();
            }
        } while (true);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
