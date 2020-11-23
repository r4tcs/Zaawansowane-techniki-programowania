package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        String s;
        while((r = Integer.parseInt(in.nextLine())) != 0) {
            s = "";
            if(r > 0){
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < r * 2; j++) {
                        if(j < r && j > i){
                            s = s + ".";
                        }
                        else if ((j - r * 2 + i >= 0)) {
                            s = s + ".";
                        }
                        else
                        {
                            s = s + "*";
                        }
                    }
                    s = s + "\n";
                }
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < r * 2; j++){
                        if((j + i < r - 1)){
                            s = s + ".";
                        }
                        else if(j >= r && -1 * (r - j) < i) {
                            s = s + ".";
                        }
                        else
                        {
                            s = s + "*";
                        }
                    }
                    s = s + "\n";
                }
            }
            else {
                r = -r;
                for(int i = 0; i < r; i++){
                    for(int j = 0; j < r * 2; j++){
                        if(j < i){
                            s = s + ".";
                        }
                        else if (j >= r && j + i + 1 < r * 2) {
                            s = s + ".";
                        }
                        else
                        {
                            s = s + "*";
                        }
                    }
                    s = s + "\n";
                }
                for(int i = 0; i < r; i++) {
                    for (int j = 0; j < r * 2; j++) {
                        if(j >= r - i && j < r){
                            s = s + ".";
                        }
                        else if(j >= r && j > r + i) {
                            s = s + ".";
                        }
                        else
                        {
                            s = s + "*";
                        }
                    }
                    s = s + "\n";
                }
            }
            System.out.println(s);
        }
    }
}
