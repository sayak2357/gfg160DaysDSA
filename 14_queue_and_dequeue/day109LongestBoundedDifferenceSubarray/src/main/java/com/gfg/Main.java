package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int arr[] = new int[]{8, 4, 2, 6, 7}, x = 4;
        Solution solution = new Solution();
        ArrayList<Integer> res = solution.longestSubarray(arr,x);
        System.out.println("given array: "+Arrays.toString(arr));
        System.out.println("longest subarray with difference less equal to "+x+" is: "+Arrays.asList(res));
    }
}