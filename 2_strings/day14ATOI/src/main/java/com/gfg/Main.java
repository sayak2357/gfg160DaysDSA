package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.printf("enter number as string: ");
        String inp = sc.nextLine();
        System.out.println("given number as string: "+inp);
        Solution sol = new Solution();
        int atoi = sol.myAtoi(inp);
        System.out.println("integer counterpart is = "+atoi);

    }

}