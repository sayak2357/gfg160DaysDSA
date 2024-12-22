package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] arr = new int[]{3, 5, 9, 10, 11, 12};
        Solution solution = new Solution();
        int k = 2;
        int kthMissing = solution.kthMissing(arr,k);
        int kthMissingOptimised = solution.kthMissingOptimised(arr,k);
        System.out.println("given array: ");
        printArr(arr);
        System.out.println(k+"th missing element from array: "+kthMissing);
        System.out.println(k+"th missing element from array: "+kthMissingOptimised);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}