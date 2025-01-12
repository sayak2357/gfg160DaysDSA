package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String inp = sc.nextLine();
        Solution solution = new Solution();
        int longestWithoutRepeat = solution.longestUniqueSubstr(inp);
        System.out.println("Longest substring without repeating character is: "+longestWithoutRepeat);
    }
}