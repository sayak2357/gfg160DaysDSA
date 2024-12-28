package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[][] mat = new int[][]{{0, 1, 2, 0},
        {3, 4, 5, 2},{1, 3, 1, 5}};
        System.out.println("given array: ");
        printArr(mat);
        Solution solution = new Solution();
        solution.setMatrixZeroes(mat);
        System.out.println("after transformation: ");
        printArr(mat);
    }
    private static void printArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}