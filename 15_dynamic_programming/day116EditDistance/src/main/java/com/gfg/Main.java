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
        System.out.printf("enter string 1: ");
        String s1 = sc.nextLine();
        System.out.printf("enter string 2: ");
        String s2 = sc.nextLine();
        Solution solution = new Solution();
        int editDistance = solution.editDistance(s1,s2);
        System.out.println("minimum operations required to convert '"+s1+"' to '"+s2+"' is = "+editDistance);
    }
}