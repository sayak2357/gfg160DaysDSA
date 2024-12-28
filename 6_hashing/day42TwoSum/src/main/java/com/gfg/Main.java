package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] arr = new int[]{1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println("Given array: ");
        printArr(arr);
        Solution solution = new Solution();
        System.out.println("pari sum = "+target+" is possible: "+solution.twoSum(arr,target));
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}