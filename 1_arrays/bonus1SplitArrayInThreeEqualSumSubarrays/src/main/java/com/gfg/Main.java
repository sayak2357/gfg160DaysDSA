package com.gfg;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{1, 3, 4, 0, 4};
        System.out.println("given array: ");
        printArr(arr);
       Solution solution = new Solution();
       List<Integer> res = solution.findSplit(arr);
        System.out.println("answer: ["+res.get(0)+","+res.get(1)+"]");
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");

        System.out.println();
    }
}