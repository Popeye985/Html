package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamenEnGeboortedatums {
    public static void main(String[] args) {
        ArrayList<String> naamLijst = new ArrayList<>();
        Scanner invoer = new Scanner(System.in);
        String naam="";
        int geboorteJaar = 0;
        int geboorteMaand = 0;
        int geboorteDag =0;
        int geboorteDatum;

        do {
            System.out.println("Geef een naam in. <Return> om te stoppen");
            naam = invoer.nextLine();
            if (!naam.equals("")) {
                System.out.println("Geef geboortejaar");
                geboorteJaar = Integer.parseInt(invoer.nextLine());
                System.out.println("Geef geboortemaand");
                geboorteMaand = Integer.parseInt(invoer.nextLine());
                System.out.println("Geef geboortedag");
                geboorteDag = Integer.parseInt(invoer.nextLine());
                Persoon p = new Persoon(naam, geboorteJaar, geboorteMaand, geboorteDag);

                naamLijst.add(naam);

            }




        } while (!naam.equals(""));


        Collections.sort(naamLijst);
        for (String v: naamLijst) {
            System.out.println(v);
        }


    }
}
