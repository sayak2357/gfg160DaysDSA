package com.github;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.printf("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.printf("number " + (i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter value of d:");
        int d = sc.nextInt();
        Solution sol = new Solution();
        sol.rotateArr(arr,d);
        System.out.println("Array after left rotation by "+d+" places: ");
        for(int num:arr)
            System.out.printf(num+" ");
    }
}
