package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int a;
        int b;
        int tmp;
        for(int i = 0; i<t; i++) {
            String line = in.nextLine();
            int space = line.indexOf(' ');
            a = Integer.parseInt(line.substring(0, space));
            b = Integer.parseInt(line.substring(space + 1));
            while(a != b){
                if(b > a){
                    b = b - a;
                }
                else {
                    a = a - b;
                }
            }
            System.out.println(a + b);
        }
    }
}
