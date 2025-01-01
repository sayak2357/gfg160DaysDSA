package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[] arr = new int[]{1, 9, 3, 10, 4, 20, 2};
        Solution solution = new Solution();
        System.out.println("given array: ");
        printArr(arr);
        int lengthOfLongestSubseq = solution.longestConsecutive(arr);
        System.out.println("length of longest consecutive subsequence = "+lengthOfLongestSubseq);
    }
    private static void printArr(int[] arr){
        for(int num:arr){
            System.out.printf(num+" ");
        }
        System.out.println();
    }
}