package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaT;
        System.out.println("Podaj liczbę testów: ");
        liczbaT = Integer.parseInt(in.nextLine());
        if(liczbaT <= 0 || liczbaT > 100) {
            return;
        }
        String[] liczby = new String[liczbaT];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < liczbaT; i++) {
            System.out.println("Podaj liczby oddzielone spacjami: ");
            liczby[i] = in.nextLine();
            stringBuilder.append(liczby[i]);
            liczby[i] = stringBuilder.reverse().toString();
            stringBuilder.setLength(0);
        }
        System.out.println("Wynik: ");
        for(int i=0; i < liczbaT; i++){
            System.out.println(liczby[i]);
        }
    }
}
