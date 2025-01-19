package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{1, 0, 1, 1, 1, 0, 0};
        Solution solution = new Solution();
        System.out.println("given array: ");
        printArr(arr);
        int ans = solution.maxLen(arr);
        System.out.printf("length of longest subarray equal number of zeros and ones is = "+ans);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}