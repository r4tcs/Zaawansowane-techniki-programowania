package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        int[] resultTab = new int[t];
        for(int i = 0; i < t; i++) {
            int S = in.nextInt();
            n = 0;
            while (S != 1)
            {
                S = recursion(S);
                n++;
            }
            resultTab[i] = n;
        }
        for(int i = 0; i < t; i++) {
            System.out.println(resultTab[i]);
        }
    }

    static int recursion(int liczba){
        if(liczba % 2 == 0) {
            return liczba/2;
        }
        else
        {
            return (3*liczba) + 1;
        }
    }
}
