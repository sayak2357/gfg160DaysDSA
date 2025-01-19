package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{10, 3, 5, 6, 2};
        System.out.println("given array: ");
        printArr(arr);
        Solution solution = new Solution();

        int[] productExceptSelf = solution.productExceptSelf(arr);
        System.out.println("product array except self is: ");
        printArr(productExceptSelf);
    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}