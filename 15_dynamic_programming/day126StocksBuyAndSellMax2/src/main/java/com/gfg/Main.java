package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] prices = new int[]{10, 22, 5, 75, 65, 80};
        Solution solution = new Solution();
        System.out.println("given prices: "+ Arrays.toString(prices));
        int maxProfit = solution.maxProfit(prices);
        System.out.println("max profit feasible with atmost 2 transactions is = "+maxProfit);
    }
}