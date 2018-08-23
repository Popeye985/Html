package com.company;

import java.time.LocalDate;

public class Persoon {

    public Persoon(String naam, int geboorteJaar, int geboorteMaand, int geboorteDag){
      geboorteDatum = LocalDate.of(geboorteJaar, geboorteMaand, geboorteDag );

    }
    private int leeftijd;
    private String naam;
    private LocalDate geboorteDatum;


    public int getLeeftijd() {
        LocalDate vandaag = LocalDate.now();

        int leeftijd = vandaag.getYear() - geboorteDatum.getYear();
            //if (vandaag.getDayofYear () < geboortedatum.getDayofYear){
            // leeftijd--;
            // }
            LocalDate verjaardag = geboorteDatum.plusYears(leeftijd);
            if (verjaardag.compareTo(vandaag) > 0){
                leeftijd--;
            }
            return leeftijd;
    }
}
