package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int V = 3, src=2;
        int edges[][] = new int[][]{{0, 1, 1}, {1, 2, 3}, {0, 2, 6}};
        //Output: [4, 3, 0]
        Solution solution = new Solution();
        int[] minDist = solution.dijkstra(V,edges,src);
        System.out.println("minimum distances matrix is: ");
        System.out.println(Arrays.toString(minDist));
    }
}