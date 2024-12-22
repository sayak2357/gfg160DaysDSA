package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int a[] = new int[]{2, 3, 6, 7, 9}, b[] = new int[]{1, 4, 8, 10};
        System.out.println("array 1: ");
        printArr(a);
        System.out.println("array 2: ");
        printArr(b);
        int k = 5;
        Solution sol = new Solution();
        int kthElement = sol.kthElement(a,b,k);
        System.out.println(k+"th element of array 1 & two is = "+kthElement);

    }
    private static void printArr(int[] arr){
        for(int num:arr)
            System.out.printf(num+" ");
        System.out.println();
    }
}