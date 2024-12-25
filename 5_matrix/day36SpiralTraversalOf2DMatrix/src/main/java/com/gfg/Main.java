package com.gfg;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[][] mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Solution solution = new Solution();
        ArrayList<Integer> sprialTraversal = solution.spirallyTraverse(mat);
        printList(sprialTraversal);
    }
    private static void printList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.printf(list.get(i)+" ");
        }
        System.out.println();
    }
}