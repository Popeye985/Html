package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GetallenSorteren {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Hoeveel getallen wil u ingeven");
        int aantalgetallen = Integer.parseInt(invoer.nextLine());
        int getallen [] = new int[aantalgetallen];
        for (int i = 0; i < getallen.length; i++) {
            System.out.printf("Geef getal %d", i+1);
            getallen[i] = Integer.parseInt(invoer.nextLine());
            // int getal = Integer.parseInt(invoer.nextLine());
            //getallen [i] = getal;

            
        }
        Arrays.sort(getallen);
        System.out.println("De gesorteerde lijst: ");
        for (int getal:getallen)
            System.out.println(getal);;
        
    }
    
}
