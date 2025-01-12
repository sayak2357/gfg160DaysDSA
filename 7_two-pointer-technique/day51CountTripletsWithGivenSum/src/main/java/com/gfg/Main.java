package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{-3, -1, -1, 0, 1, 2};
        int target = -2;
        Solution solution = new Solution();
        int count = solution.countTriplets(arr,target);
        System.out.println("given array: ");
        printArray(arr);
        System.out.println("number of triplets with sum = "+target+" is = "+count);
    }
    private static void printArray(int[] arr){
        for(int a:arr){
            System.out.printf(a+" ");
        }
        System.out.println();
    }
}