package com.gfg;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        Solution solution = new Solution();
        ArrayList<Integer> ans = solution.maxOfSubarrays(arr,k);
        System.out.println("given array: ");
        printArr(arr);
        System.out.println("maximum window values with k = "+k+" is:");
        System.out.println(Arrays.asList(ans));
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}