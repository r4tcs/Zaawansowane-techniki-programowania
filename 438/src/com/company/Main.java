package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int liczba;
        Scanner in = new Scanner(System.in);
        int ile;
        ile = in.nextInt();
        if(ile > 100000)
        {
            return;
        }
        for(int i = 0; i<ile; i++) {
            System.out.println("Podaj liczbę: ");
            liczba = in.nextInt();
            if(liczba < 1 || liczba > 10000)
            {
                return;
            }
            if(czyPierwsza(liczba)){
                System.out.println("Tak");
            }
            else
            {
                System.out.println("Nie");
            }
        }
    }

    private static boolean czyPierwsza(int liczba) {
        if(liczba < 2) {
            return false;
        }
        for(int i = 2; i*i<=liczba; i++) {
            if(liczba%i == 0) {
                return false;
            }
        }
        return true;
    }
}
