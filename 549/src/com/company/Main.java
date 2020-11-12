package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int liczbaTestow;
        int doZsumowania;
        int spacja;
        int dlugoscStringa;
        String liczby;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę testów: ");
        liczbaTestow = Integer.parseInt(in.nextLine());
        int suma = 0;
        for (int i = 0; i < liczbaTestow; i++) {
            System.out.println("Podaj ilość liczb do zsumowania: ");
            doZsumowania = Integer.parseInt(in.nextLine());
            System.out.println("Podaj liczby oddzielone spacją: ");
            liczby = in.nextLine();
            String[] numbers = liczby.split(" ");
            for (int j = 0; j < doZsumowania; j++) {
                suma += Integer.parseInt(numbers[j]);
            }
            System.out.println(suma);
        }
    }
}
