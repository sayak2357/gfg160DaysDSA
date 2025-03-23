package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
       Solution solution = new Solution();
       int minCost = solution.minCostClimbingStairs(cost);
        System.out.println("min cost = "+minCost);
    }
}