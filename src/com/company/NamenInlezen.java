package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamenInlezen {
    private static final String BESTAND = "namen.txt";


    public static void main(String[] args) throws IOException {
        ArrayList<String> naamLijst = new ArrayList<>();
        try {
            Scanner inlezen = new Scanner(new BufferedReader(new FileReader("namen.txt")));
            while (inlezen.hasNextLine()) {
                String naam = inlezen.nextLine();
                naamLijst.add(naam);

            }
            Collections.sort(naamLijst);
            for (String n:naamLijst) {
                System.out.println(n);
            }
            inlezen.close();



        }catch (FileNotFoundException ex){
            System.out.println();

        }


    }

}
