package com.gfg;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter text string: ");
        String inp = sc.nextLine();
        System.out.printf("Enter pattern string: ");
        String pat = sc.nextLine();
        Solution sol = new Solution();
        List<Integer> occurences = sol.search(pat,inp);
        System.out.println("occurences of "+pat+" in "+inp+" are at indices: ");
        printList(occurences);
    }
    private static void printList(List<Integer> indices){
        for(int idx:indices)
            System.out.printf(idx+" ");
        System.out.println();
    }
}