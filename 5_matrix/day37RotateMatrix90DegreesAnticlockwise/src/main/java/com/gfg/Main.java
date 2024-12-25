package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[][] mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("array before rotation: ");
        printArr(mat);
        Solution solution = new Solution();
        System.out.println("array after 90 degrees anti-clockwise rotation");
        solution.rotateby90(mat);
        printArr(mat);
    }
    private static void printArr(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}