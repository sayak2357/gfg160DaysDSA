package com.gfg;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] arr1= new int[]{1, 2, 1, 3, 1}, arr2 = new int[]{3, 1, 3, 4, 1};
        System.out.println("given arrays are:");
        printArr(arr1);
        printArr(arr2);
        Solution solution = new Solution();
        List<Integer> intersection = solution.intersectionWithDuplicates(arr1,arr2);
        System.out.println("intersection elements of these two arrays are: ");
        printList(intersection);
    }
    private static void printArr(int[] arr){
        for(int num:arr){
            System.out.printf(num+" ");
        }
        System.out.println();
    }
    private static void printList(List<Integer> list){
        for(int num:list){
            System.out.printf(num +" ");
        }
        System.out.println();
    }
}