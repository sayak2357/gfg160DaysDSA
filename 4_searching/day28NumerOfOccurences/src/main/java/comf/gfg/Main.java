package comf.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] arr = new int[]{2,6,6,6,7,7,7,7};
        Solution sol = new Solution();
        int target = 7;
        int freqOfTarget = sol.countFreq(arr,target);
        System.out.println("given array:");
        printArr(arr);
        System.out.println("frequency of "+target+" in given array = "+freqOfTarget);
    }
    private static void printArr(int[] arr){
        for(int num:arr) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}