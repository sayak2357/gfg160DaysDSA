package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter size of 1st sored array: ");
        int n = sc.nextInt();
        System.out.printf("enter size of 2nd sorted array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Taking array 1's input...");
        for(int i=0;i<n;i++){
            System.out.printf("enter element "+(i+1)+": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Taking array 2's input...");
        for(int i=0;i<m;i++){
            System.out.printf("enter element "+(i+1)+": ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Given array 1 & array 2: ");
        printArr(arr1);
        printArr(arr2);
        Solution sol = new Solution();
        sol.mergeArrays(arr1,arr2);
        System.out.println("array 1 & arr 2 after merging: ");
        printArr(arr1);
        printArr(arr2);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}