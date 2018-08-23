package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GetallenSorterenDynamisch {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int [] getallen = new int[3];
        int getal;
        int teller=0;



        do {
            System.out.println("Geef een getal");
            getal = Integer.parseInt(invoer.nextLine());
            if (getal >= 0){
                if (teller == getallen.length){
                    getallen = vergrootArray(getallen);
                }
                getallen[teller] = getal;
                teller++;
            }



        }while (getal >= 0);

        Arrays.sort(getallen, 0, teller);
        for (int i = 0; i < teller ; i++) {
            System.out.println(getallen [i]);
        }
        }

    private static int[] vergrootArray(int[] getallen) {
        int[] temp = new int[getallen.length +1];
        System.arraycopy(getallen, 0, temp, 0, getallen.length);
        return temp;
    }


}



