package com.gfg;

import java.sql.SQLOutput;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{0, -1, 2, -3, 1};
        System.out.println("Given array: ");
        printArr(arr);
        Solution solution = new Solution();
        List<List<Integer>> triplets = solution.findTriplets(arr);
        System.out.println("triplets with zero sum: ");
        printList(triplets);
    }
    private static void printList(List<List<Integer>> arr){
        for(int i=0;i<arr.size();i++){
            List<Integer> res = arr.get(i);
            for(int num:res){
                System.out.printf(num+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void printArr(int[] res){
        for(int num:res){
            System.out.printf(num+" ");
        }
        System.out.println();
    }
}