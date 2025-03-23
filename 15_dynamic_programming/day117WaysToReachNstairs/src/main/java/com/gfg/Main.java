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
        System.out.printf("enter value of n = ");
        int n = sc.nextInt();
        Solution solution = new Solution();
        int countNWays = solution.countWays(n);
        System.out.println("ways to count "+n+" stairs is = "+countNWays);
    }
}