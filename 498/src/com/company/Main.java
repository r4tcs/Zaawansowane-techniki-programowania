package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = Integer.parseInt(in.nextLine());
        for(int a=0; a < D; a++) {
            int uWordLength = Integer.parseInt(in.nextLine());
            String uWord = in.nextLine();
            int vWordLength = Integer.parseInt(in.nextLine());
            String vWord = in.nextLine();
            int[][] tabWithSubWordsLength = new int[vWordLength+1][uWordLength+1];
            for(int i = 0; i <= vWordLength; i++) {
                tabWithSubWordsLength[i][0] = 0;
            }
            for(int j = 0; j <= uWordLength; j++) {
                tabWithSubWordsLength[0][j] = 0;
            }
            for(int i = 1; i <= vWordLength; i++) {
                for(int j = 1; j <= uWordLength; j++) {
                    if(uWord.charAt(j-1) == vWord.charAt(i-1)){
                        tabWithSubWordsLength[i][j] = tabWithSubWordsLength[i-1][j-1] + 1;
                    }
                    else {
                        tabWithSubWordsLength[i][j] = Math.max(tabWithSubWordsLength[i-1][j], tabWithSubWordsLength[i][j-1]);
                    }
                }
            }
            System.out.println(tabWithSubWordsLength[vWordLength][uWordLength]);
        }
    }
}
