package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] arr = new int[]{5, 6, 1, 2, 3, 4};
        Solution sol = new Solution();
        int target = 7;
        int minEle = sol.findMin(arr);
        System.out.println("given array:");
        printArr(arr);
        System.out.println("minimum element in given array = "+minEle);
    }
    private static void printArr(int[] arr){
        for(int num:arr) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}