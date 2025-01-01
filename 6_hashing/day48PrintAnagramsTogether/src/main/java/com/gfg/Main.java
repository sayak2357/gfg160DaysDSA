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

        String[] words = new String[]{"act", "god", "cat", "dog", "tac"};
        Solution solution = new Solution();
        ArrayList<ArrayList<String>> anagrams = solution.anagrams(words);
        System.out.println("anagram sets: ");
        printListOfList(anagrams);
    }
    private static void printListOfList(ArrayList<ArrayList<String>> list){
        for(ArrayList<String> anagramSet:list){
            for(String temp: anagramSet){
                System.out.printf(temp+" ");
            }
            System.out.println();
        }
    }
}