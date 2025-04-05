package com.gfg;



import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int start[] = new int[]{1, 3, 0, 5, 8, 5}, finish[] = new int[]{2, 4, 6, 7, 9, 9};
        Solution solution = new Solution();
        int maxActivitiesPossible = solution.activitySelection(start,finish);
        System.out.println("The start times of activities: "+ Arrays.toString(start));
        System.out.println("The finish times of activities: "+ Arrays.toString(finish));
        System.out.println("Minimum activities possible: "+maxActivitiesPossible);
    }
}