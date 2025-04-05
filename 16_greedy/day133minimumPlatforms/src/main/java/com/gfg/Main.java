package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int arr[] = new int[]{900, 940, 950, 1100, 1500, 1800}, dep[] = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        Solution solution = new Solution();
        int minPlatformsRequired = solution.findPlatform(arr,dep);
        System.out.println("The arrival times: "+ Arrays.toString(arr));
        System.out.println("The departure times: "+ Arrays.toString(dep));
        System.out.println("Minimum platforms required: "+minPlatformsRequired);
    }
}