package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        String s1,s2;
        System.out.printf("enter binary string 'a': ");
        s1 = sc.nextLine();
        System.out.printf("enter binary string 'b': ");
        s2 = sc.nextLine();
        Solution sol = new Solution();
        System.out.println("a+b = "+sol.addBinary(s1,s2));
    }
}