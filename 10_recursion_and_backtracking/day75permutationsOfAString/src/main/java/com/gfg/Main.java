package com.gfg;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter a string: ");
        String inp = sc.nextLine();
        Solution solution = new Solution();
        ArrayList<String> permutations = solution.findPermutation(inp);
        System.out.println("permutations of the string '"+inp+"' are: ");
        printList(permutations);
    }
    private static void printList(ArrayList<String> list){
        for(String item:list)
            System.out.println(item);
    }
}