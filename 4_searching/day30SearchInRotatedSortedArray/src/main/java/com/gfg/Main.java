package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        Solution sol = new Solution();
        int key = 8;
        int idx = sol.search(arr,key);
        System.out.println("given array:");
        printArr(arr);
        System.out.println("key "+key+" is present in given array at index = "+idx);
    }
    private static void printArr(int[] arr){
        for(int num:arr) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}