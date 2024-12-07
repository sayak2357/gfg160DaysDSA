package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String inp = sc.nextLine();
        Solution sol = new Solution();
        char firstNonRepeat = sol.nonRepeatingChar(inp);

        System.out.println("First non-repeating char in "+inp+" is: "+firstNonRepeat);
        firstNonRepeat = sol.nonRepeatingCharOptimised(inp);
        System.out.println("First non-repeating char with optimised algo in "+inp+" is: "+firstNonRepeat);
    }
}