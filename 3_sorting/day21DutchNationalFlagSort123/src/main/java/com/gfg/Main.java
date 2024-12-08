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
        System.out.printf("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1;i<=n;i++){
            System.out.print("enter element "+i+": ");
            int num = sc.nextInt();
            arr[i-1] = num;
        }
        Solution sol = new Solution();
        System.out.print("array before soring: ");
        printArr(arr);
        sol.sort012(arr);
        System.out.print("array after soring: ");
        printArr(arr);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}