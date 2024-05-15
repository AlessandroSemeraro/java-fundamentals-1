package Esercizi;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {

        boolean accesso = false;
        //creare e inizializzare l’array contenente i nomi degli invitati
        String[] guestList = {
                "Jennifer Lopez",
                "Zendaya",
                "Chris Hemsworth",
                "Bad Bunny",
                "Cara Delevingne",
                "Kendall Jenner",
                "Uma Thurman",
                "Damiano David",
                "Luca Guadagnino"
        };

        //apro scanner e chiedo all’utente come si chiama
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String guestName = scanner.nextLine();

        //ciclo per ogni nome nella lista degli invitati per verificare che il nome sia presente nella lista
        for (int i = 0; i < guestList.length; i++) {

            //se il nome dell'invitato è nella lista, allora
            if (guestList[i].equals(guestName)) {

                accesso = true;
                break;
            }
        }

        if (accesso) {
            System.out.println("Accettato");
        } else {
            System.out.println("Rifiutato");
        }

        scanner.close();
    }
}