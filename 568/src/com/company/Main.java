package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iloscLiczb;
        int suma;
        int iloscSumowan;
        boolean palindrom;
        System.out.println("Podaj ilość liczb do sprawdzenia: ");
        iloscLiczb = in.nextInt();
        String liczba;
        int[] liczbyDoSprawdzenia = new int [iloscLiczb];
        int[] iloscSumowanTab = new int[iloscLiczb];
        for(int i = 0; i < iloscLiczb; i++) {
            liczbyDoSprawdzenia[i] = in.nextInt();
        }
        for(int i = 0; i < iloscLiczb; i++) {
            palindrom = false;
            iloscSumowan = 0;
            while(!palindrom) {
                liczba = Integer.toString(liczbyDoSprawdzenia[i]);
                String liczba1 = Integer.toString(liczbyDoSprawdzenia[i]);
                String liczba2 = new StringBuilder(liczba).reverse().toString();
                if(liczba1.equals(liczba2)) {
                    palindrom = true;
                }
                if (liczba.charAt(0) != liczba.charAt(liczba.length()-1)) {
                    suma = liczbyDoSprawdzenia[i] + Integer.parseInt(new StringBuilder(liczba).reverse().toString());
                    iloscSumowan++;
                    liczbyDoSprawdzenia[i] = suma;
                }
                iloscSumowanTab[i] = iloscSumowan;
            }
        }
        for(int i = 0; i < iloscLiczb; i++) {
            System.out.println(liczbyDoSprawdzenia[i] + " " + iloscSumowanTab[i]);
        }
    }
}
