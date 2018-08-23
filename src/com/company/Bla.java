package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bla {

        public static void main(String[] args) {
        ArrayList<String>naamLijst = new ArrayList<>();
        Scanner invoer = new Scanner(System.in);
        String voornaam;
        do {
            System.out.println("Geef een naam in. <Return> om te stoppen");
            voornaam = invoer.nextLine();
            if (!voornaam.equals("")) {
                naamLijst.add(voornaam);
            }




        } while (!voornaam.equals(""));


            Collections.sort(naamLijst);
            for (String v: naamLijst) {
                System.out.println(v);
            }





        }


        }



