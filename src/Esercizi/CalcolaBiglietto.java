package Esercizi;

// importo scanner
import java.util.Scanner;

public class CalcolaBiglietto {

    public static void main(String[] args) {

        // apro uno Scanner che legge da tastiera
        Scanner scanner = new Scanner(System.in);

        // chiedo kilometri da percorrere e età cliente
        double kmUsers, ageUsers;

        System.out.print("Kilometri da percorrere: ");
        // legge il valore come stringa da tastiera poi lo converte in int
        kmUsers = Integer.parseInt(scanner.nextLine());

        System.out.print("Inserisci la tua età: ");
        // legge il valore come stringa da tastiera poi lo converte in int
        ageUsers =Integer.parseInt(scanner.nextLine());

        // cast per evitare effetto double
        System.out.println("Il cliente deve percorrere: " + (int)kmUsers + " km");
        System.out.println("Il cliente ha " + (int)ageUsers + " anni");

        // prezzo per km
        double priceTicketForKm = 0.21;

        // prezzo biglietto per km
        double priceTicket = kmUsers * priceTicketForKm;

        //parametrizzo prezzo finale biglietto e sconto per minorenni e anziani
        double priceFinalTicket,discountPriceMinor,discountPriceOlder;

        //Applico condizione sconti e prezzo finale biglietto

            //per passeggeri under 18
        if (ageUsers < 18) {
            discountPriceMinor = ((priceTicket * 20 ) / 100 );
            priceFinalTicket = priceTicket - discountPriceMinor ;
            System.out.println("Il prezzo del biglietto per under 18 è di €" + priceFinalTicket );

            //per passeggeri over 65
        } else if (ageUsers >= 64) {
            discountPriceOlder = ((priceTicket * 40 ) / 100 );
            priceFinalTicket = priceTicket - discountPriceOlder ;
            System.out.println("Il prezzo del biglietto over 65 è di €" + priceFinalTicket );

            //per i restanti passeggeri
        } else {
            priceFinalTicket = priceTicket;
            System.out.println("Il prezzo del biglietto è di €" + priceFinalTicket);
        }

        // chiudo lo Scanner
        scanner.close();
    }



}
