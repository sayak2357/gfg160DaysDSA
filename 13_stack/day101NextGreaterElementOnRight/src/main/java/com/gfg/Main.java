package com.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{1, 3, 2, 4};
        Solution solution = new Solution();
        ArrayList<Integer> nextGreater = solution.nextLargerElement(arr);
        System.out.println("input array: ");
        printArr(arr);
        System.out.println("next greater elemets:");
        printList(nextGreater);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
    private static void printList(List<Integer> list){
        for(int num:list)
            System.out.printf(num+" ");

        System.out.println();
    }
}