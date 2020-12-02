package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int a;
        int b;
        String s;
        for(int i = 0; i < t; i++){
            s = in.nextLine();
            a = Integer.parseInt(s.substring(0, s.indexOf(' ')));
            b = Integer.parseInt(s.substring(s.indexOf(' ') + 1));
            checkIfSignificant(a,b);
        }
    }

    private static void checkIfSignificant(int a, int b) {
        int howManyDividers=0;
        int sum = 0;
        int howManySignificants=0;
        int number=0;
        for(int i = a; i <=b; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    sum = sum + j;
                    howManyDividers++;
                }
            }
            number = i;
        }
        if(howManyDividers > 0){
            double average = sum/howManyDividers;
            if(average <= Math.sqrt(number)){
                howManySignificants++;
            }
        }
        System.out.println(howManySignificants);
    }
}
