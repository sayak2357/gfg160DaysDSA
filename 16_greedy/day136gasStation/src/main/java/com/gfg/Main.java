package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int gas[] = new int[]{4, 5, 7, 4}, cost[]= new int[]{6, 6, 3, 5};
        Solution solution = new Solution();
        int startStation = solution.startStation(gas,cost);
        System.out.println("gas array: "+ Arrays.toString(gas));
        System.out.println("cost array: "+Arrays.toString(cost));
        System.out.println("start index = "+startStation);
    }
}