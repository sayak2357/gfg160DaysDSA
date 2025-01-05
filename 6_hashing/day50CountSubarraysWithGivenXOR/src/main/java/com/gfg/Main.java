package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[] arr = new int[]{4, 2, 2, 6, 4};
        int k = 6;
        Solution solution = new Solution();
        long count = solution.subarrayXor(arr, k);
        System.out.println("given array:");
        printArray(arr);
        System.out.println("number of subarrays with xor = " + k + " is " + count);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}