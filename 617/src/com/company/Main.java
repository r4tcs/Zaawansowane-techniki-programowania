package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Podaj liczbę testów: ");
        Scanner in = new Scanner(System.in);
        int t;
        t = Integer.parseInt(in.nextLine());
        String[] s = new String[t];
        String s1;
        String s2;
        int space;
        for(int i = 0; i < t; i++){
            s[i] = in.nextLine();
            space = s[i].indexOf(' ');
            s1 = s[i].substring(0, space);
            s2 = s[i].substring(space + 1);
            System.out.println(string_merge(s1, s2));
        }
    }

    private static String string_merge(String s1, String s2) {
        String string = "";
        for(int i = 0; i < s1.length() && i < s2.length() ; i++){
            string = string + s1.charAt(i) + s2.charAt(i);
        }
        return string;
    }
}
