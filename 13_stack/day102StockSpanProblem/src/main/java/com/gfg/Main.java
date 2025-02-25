package com.gfg;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        Solution solution = new Solution();
        ArrayList<Integer> stockSpan = solution.calculateSpan(arr);
        System.out.println("stock span of: ");
        printArr(arr);
        System.out.printf(" is = ");
        printList(stockSpan);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
    }
    private static void printList(ArrayList<Integer> list){
        for(int num:list)
            System.out.printf(num+" ");
    }
}