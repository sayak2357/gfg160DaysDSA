package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int arr[] = new int[]{3, 34, 4, 12, 5, 2}, sum = 9;
        Solution solution = new Solution();
        Boolean isSubsetSum = solution.isSubsetSum(arr,sum);
        System.out.println("given array: "+ Arrays.toString(arr)+"\ntarget = "+sum);
        System.out.println("subsetsum possible verdict: "+isSubsetSum);
    }
}