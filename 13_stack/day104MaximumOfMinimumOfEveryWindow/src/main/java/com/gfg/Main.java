package com.gfg;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{10, 20, 30, 50, 10, 70, 30};
        Solution solution = new Solution();
        ArrayList<Integer> ans = solution.maxOfMins(arr);
        System.out.println("given array: ");
        printArr(arr);
        System.out.println("max of min of every windows size: ");
        printList(ans);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
    private static void printList(ArrayList<Integer> list){
        for(int num:list)
            System.out.printf(num+" ");
        System.out.println();
    }
}