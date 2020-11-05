package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int przypadki = 0;
        int cyfraJednosci=0;
        int cyfraDziesiatek=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę przypadków do rozważenia: ");
        przypadki = in.nextInt();
        int[] liczby = new int [przypadki];
        int silnia = 1;
        for(int i = 0; i < przypadki; i++) {
            System.out.println("Podaj nieujemną liczbę całkowitą: ");
            liczby[i] = in.nextInt();
            if(liczby[i] < 0) {
                System.out.println("Podano złe dane wejściowe.");
                return;
            }
        }
        for (int j = 0; j < przypadki; j++) {
            for(int k = 1; k <= liczby[j]; k++) {
                silnia = silnia * k;
            }
            System.out.println((silnia % 100)/10 + " " + silnia % 10);
        }
    }
}
