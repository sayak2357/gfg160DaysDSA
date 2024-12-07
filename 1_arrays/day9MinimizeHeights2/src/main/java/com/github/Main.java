package com.github;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.printf("Enter size of prices array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.printf("number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Enter value of k = ");
        int k = sc.nextInt();
        Solution sol = new Solution();
        int minDiff = sol.getMinDiff(arr,k);
        System.out.println("minimum diff of max & min after adding or subtracting " + k+" is = "+minDiff);
    }
}