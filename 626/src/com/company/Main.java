package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int k=0; k < t; k++)
        {
            String string;
            string = in.nextLine();
            int N = Integer.parseInt(string.substring(0, string.indexOf(' ')));
            int M = Integer.parseInt(string.substring(string.indexOf(' ') + 1));
            if(N <= 0 || N > 10000 || M <=0 || M > 1000000000)
            {
                return;
            }
            int[] times = new int[N];
            for(int i = 0; i < N; i++) {
                times[i] = Integer.parseInt(in.nextLine());
                if(times[i] <= 0 || times[i] > 100000) {
                    return;
                }
            }
            int dayInSeconds = 86400;
            double howManyCookies = 0;
            double temp;
            for(int i = 0; i < N; i++) {
                howManyCookies = howManyCookies + (dayInSeconds / times[i]);
            }
            temp = howManyCookies / M;
            int howManyBoxes = (int)temp;
            if(temp - howManyBoxes > 0){
                howManyBoxes++;
            }
            System.out.println(howManyBoxes);
        }
    }
}
