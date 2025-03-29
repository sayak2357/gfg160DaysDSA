package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        Solution solution = new Solution();
        int minJumps = solution.minJumps(arr);
        System.out.println("given array: "+ Arrays.toString(arr));
        System.out.println("minimum jumps required to cover the array is = "+minJumps);
    }
}