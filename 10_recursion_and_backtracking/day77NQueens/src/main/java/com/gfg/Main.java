package com.gfg;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter value of n: ");
        int n = sc.nextInt();
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> sol = solution.nQueen(n);
        printArrayList(sol,n);
    }
    private static void printArrayList(ArrayList<ArrayList<Integer>> sol, int n){
        for(ArrayList<Integer> ansSet:sol){
            for(int i=0;i<n;i++) {
                System.out.printf(ansSet.get(i)+" ");
            }
            System.out.println();
        }
    }
}