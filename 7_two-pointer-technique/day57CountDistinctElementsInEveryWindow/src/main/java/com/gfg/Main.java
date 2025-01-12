package com.gfg;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println("given array: ");
        printArr(arr);
        Solution solution = new Solution();
        List<Integer> ans = solution.countDistinct(arr,k);
        System.out.println("number of unique elements in subarray of size = "+k+" is:");
        printList(ans);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
    private static void printList(List<Integer> res){
        for(int i=0;i<res.size();i++)
            System.out.printf(res.get(i)+" ");
        System.out.println();
    }
}