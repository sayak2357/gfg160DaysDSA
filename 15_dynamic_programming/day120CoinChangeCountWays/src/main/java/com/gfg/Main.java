package com.gfg;

import java.sql.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] coins = new int[]{1,2,3};
        int sum = 4;
        Solution solution = new Solution();
        int countWays = solution.count(coins,sum);
        System.out.println("given denominations: "+ Arrays.toString(coins));
        System.out.println("number of ways for making "+sum+" is = "+countWays);
        Solution2 solution2 = new Solution2();
        countWays = solution2.count(coins,sum);
        System.out.println("number of ways for making "+sum+" using top-down method is = "+countWays);
    }
}