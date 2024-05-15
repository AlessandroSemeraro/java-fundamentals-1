package Esercizi;

import java.util.Arrays;

public class CibiPreferiti {
    public static void main(String[] args) {
        String[] cibiPreferiti = new String[9];

        cibiPreferiti[0] = "Pizza";
        cibiPreferiti[1] = "Pasta";
        cibiPreferiti[2] = "Gelato";
        cibiPreferiti[3] = "Frutta";
        cibiPreferiti[4] = "Crepes";
        cibiPreferiti[5] = "Cioccolata";
        cibiPreferiti[6] = "Biscotti";
        cibiPreferiti[7] = "Carne";
        cibiPreferiti[8] = "Verdura";

        System.out.println(Arrays.toString(cibiPreferiti));


        //stampare la lunghezza della classifica
        System.out.println("la lunghezza d ella mia classifica:" + cibiPreferiti.length);

        //il vostro cibo top (prima posizione della classifica)
        System.out.println("la mia pietanza preferita:" + cibiPreferiti[0]);

        //il vostro cibo preferito ma non troppo (ultima posizione della classifica)
        System.out.println("la pietanza meno preferita:" + cibiPreferiti[cibiPreferiti.length - 1]);

        //il cibo di mezza classifica, cioè che si trova nella posizione mediana
        System.out.println("pietanza a metà classifica:" + cibiPreferiti[cibiPreferiti.length / 2]);
    }
};

