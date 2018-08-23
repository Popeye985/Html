package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamenTxt {
        private static final String BESTAND = "namen.txt";
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(BESTAND)))){
                System.out.print("Geef naam (<RETURN> om te stoppen): ");
                String naam = scanner.nextLine();
                while (!naam.equals("")){
                    writer.println(naam);
                    System.out.print("Geef naam (<RETURN> om te stoppen): ");
                    naam = scanner.nextLine();
                }
            }
        }
}
