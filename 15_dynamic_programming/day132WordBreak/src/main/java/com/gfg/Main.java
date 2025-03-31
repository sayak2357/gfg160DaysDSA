package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String s = "gfgilike", dictionary[] = new String[]{"i", "like", "gfg"};
        Solution solution = new Solution();
        boolean isWrodBreakPossible = solution.wordBreak(s,dictionary);
        System.out.println("given input string s = "+s+" and given dictionary = "+ Arrays.toString(dictionary));
        System.out.println("word break verdict: "+isWrodBreakPossible);
    }
}