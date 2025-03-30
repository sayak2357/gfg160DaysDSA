package com.gfg;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{6, 5, 5, 7, 4};
        Solution solution = new Solution();
        int maxProfit = solution.findMaxSum(arr);
        System.out.println("given array: "+ Arrays.toString(arr));
        System.out.println("max profit made by thief is: "+maxProfit);
    }
}