package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int D;
        Scanner s = new Scanner(System.in);
        D = Integer.parseInt(s.nextLine());
        for(int i = 0; i < D; i++){
            String string = s.nextLine();
            int L = Integer.parseInt(string.substring(0, string.indexOf(' ')));
            String C = string.substring(string.indexOf(' ') + 1);
            int x;
            if(C.length() > 2) {
                x = Integer.parseInt(C.substring(C.length() - 2));
            }
            else {
                x = Integer.parseInt(C);
            }
            if(x % L == 0) {
                System.out.println("TAK");
            }
            else {
                System.out.println("NIE");
            }
        }
    }
}
