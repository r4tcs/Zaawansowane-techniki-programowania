package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        int n;
        for(int i = 0; i < t; i++){
            n = scanner.nextInt();
            int[] players = new int[n];
            for(int j = 0; j < n; j++){
                players[j] = scanner.nextInt();
            }
            List<Match> matchList = new ArrayList<>();
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(j != k){
                        Match match = new Match();
                        match.player1 = j;
                        match.player2 = k;
                        for (Match m : matchList) {
                            match.winner = j;
                            if(m == match){
                                flag = true;
                                break;
                            }
                            match.winner = k;
                            if(m == match){
                                flag = true;
                                break;
                            }
                        }
                        if(!flag){
                            matchList.add(match);
                            flag = false;
                        }
                    }
                }
            }
            System.out.println(matchList.size() % 1000);
        }

    }
}
