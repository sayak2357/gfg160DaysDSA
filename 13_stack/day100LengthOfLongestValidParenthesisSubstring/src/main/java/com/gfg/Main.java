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
        System.out.printf("enter string: ");

        String s = sc.nextLine();
        Solution solution = new Solution();
        int lengthOfLongestValidSubstrig = solution.maxLength(s);
        System.out.println("In given input string: "+s+", length of longest balanced substring is = "+lengthOfLongestValidSubstrig);
    }
}