package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int[] T;
    private static int n;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine()) - 1;
        T = new int[n];
        rozklad(T,0,n,n);
    }

    private static void rozklad(int[] T, int ti, int co, int maxSkl) {
        int i;
        if(co == 0){
            System.out.print(n + " = ");
            for(i = 0; i < ti - 1; i++) {
                System.out.print(T[i] + "+");
            }
            System.out.println(T[ti]);
        }
        else {
            ti++;
            for(i = Math.min(co, maxSkl); i > 0; i--){
                T[ti] = i;
                rozklad(T, ti, co - i, i);
            }
        }
    }


//    private enum CheckSum {LESS, EQUAL}
//
//    public static Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        int t = Integer.parseInt(in.nextLine());
//        List<Integer> listOfNumbers = new ArrayList<>();
//        for (int i = 0; i < t; i++) {
//            listOfNumbers.add(Integer.parseInt(in.nextLine()));
//        }
//
//        for (Integer number : listOfNumbers) {
//            resolveAllPossibleIncreasingNaturalSequences(number);
//            System.out.println();
//        }
//    }
//
//    private static void resolveAllPossibleIncreasingNaturalSequences(Integer number) {
//        List<Integer> tableOfSequence = initTableAndFillItWithOnes(number);
//        while(tableOfSequence.size() != 0) {
//            CheckSum checkSum = checkSumOfSequence(tableOfSequence, number);
//            switch (checkSum) {
//                case LESS -> incrementLastElementOfSequence(tableOfSequence);
//                case EQUAL -> {
//                    printSequence(tableOfSequence);
//                    removeLastElementOfSequence(tableOfSequence);
//                }
//            }
//        }
//    }
//
//    private static void removeLastElementOfSequence(List<Integer> tableOfSequence) {
//        tableOfSequence.remove(tableOfSequence.size() - 1);
//    }
//
//    private static void printSequence(List<Integer> tableOfSequence) {
//        for(Integer number : tableOfSequence){
//            System.out.print(number + " ");
//        }
//        System.out.println();
//    }
//
//    private static void incrementLastElementOfSequence(List<Integer> tableOfSequence) {
//        int size = tableOfSequence.size();
//        tableOfSequence.set(size - 1 , tableOfSequence.get(size - 1) + 1);
//    }
//
//    private static List<Integer> initTableAndFillItWithOnes(Integer number) {
//        List<Integer> tab = new ArrayList<>();
//        for (int j = 0; j < number; j++) {
//            tab.add(1);
//        }
//        return tab;
//    }
//
//    private static CheckSum checkSumOfSequence(List<Integer> tableOfSequence, Integer number){
//        int sum = 0;
//        for(Integer sequenceNumber : tableOfSequence) {
//            sum += sequenceNumber;
//        }
//        if(sum < number){
//            return CheckSum.LESS;
//        }
//        return CheckSum.EQUAL;
//    }
}
