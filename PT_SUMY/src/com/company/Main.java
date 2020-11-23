package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private enum CheckSum {LESS, EQUAL, GREATER}

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int t = Integer.parseInt(in.nextLine());
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            listOfNumbers.add(Integer.parseInt(in.nextLine()));
        }

        for (Integer number : listOfNumbers) {
            resolveAllPossibleIncreasingNaturalSequences(number);
            System.out.println();
        }
    }

    private static void resolveAllPossibleIncreasingNaturalSequences(Integer number) {
        List<Integer> tableOfSequence = initTableAndFillItWithOnes(number);
        while (tableOfSequence.size() != 0) {
            tableOfSequence = initTableAndFillItWithOnes(tableOfSequence.size());
            incrementLastElementOfSequence(tableOfSequence, number);
            tableOfSequence = initTableAndFillItWithOnes(tableOfSequence.size());
            incrementElementsOfSequence(tableOfSequence, number);
            removeLastElementOfSequence(tableOfSequence);
        }
    }

    private static void incrementLastElementOfSequence(List<Integer> tableOfSequence, Integer number) {
        int size = tableOfSequence.size();
        CheckSum checkSum;
        if(size > 1){
            for(int i = 1; i < number; i++){
                tableOfSequence.set(size - 1, tableOfSequence.get(size - 1) + 1);
                checkSum = checkSumOfSequence(tableOfSequence, number);
                if(checkSum == CheckSum.EQUAL && tableOfSequence.get(size-1) > 2){
                    printSequence(tableOfSequence);
                }
            }
        }
    }

    private static void removeLastElementOfSequence(List<Integer> tableOfSequence) {
        tableOfSequence.remove(tableOfSequence.size() - 1);
    }

    private static void printSequence(List<Integer> tableOfSequence) {
        for(Integer number : tableOfSequence){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void incrementElementsOfSequence(List<Integer> tableOfSequence, int number) {
        int size = tableOfSequence.size();
        int i = 1;
        CheckSum checkSum;
        while(tableOfSequence.get(size-1) != number) {
            checkSum = checkSumOfSequence(tableOfSequence, number);
            if(checkSum == checkSum.EQUAL)
            {
                printSequence(tableOfSequence);
            }
            if(i > size){
                i = 1;
            }
            tableOfSequence.set(size - i, tableOfSequence.get(size - i) + 1);
            i++;
        }
        if(tableOfSequence.get(0) == number){
            printSequence(tableOfSequence);
        }
    }

    private static List<Integer> initTableAndFillItWithOnes(Integer length) {
        List<Integer> tab = new ArrayList<>();
        for (int j = 0; j < length; j++) {
            tab.add(1);
        }
        return tab;
    }

    private static CheckSum checkSumOfSequence(List<Integer> tableOfSequence, Integer number){
        int sum = 0;
        for(Integer sequenceNumber : tableOfSequence) {
            sum += sequenceNumber;
        }
        if(sum < number){
            return CheckSum.LESS;
        }
        if(sum == number){
            return CheckSum.EQUAL;
        }
        return CheckSum.GREATER;
    }

}
