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
        int[] arr = new int[]{2, 1, 3, 4};
        Solution solution = new Solution();
        int minimumMultiplications = solution.matrixMultiplication(arr);
        System.out.println("given dimensions: "+ Arrays.toString(arr));
        System.out.println("minimum multiplications required is = "+minimumMultiplications);
    }
}