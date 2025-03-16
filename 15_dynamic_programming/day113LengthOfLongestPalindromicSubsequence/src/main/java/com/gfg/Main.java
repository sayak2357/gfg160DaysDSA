package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

       String s = "bbabcbcab";
       Solution solution = new Solution();
        System.out.println("given string= "+s);
        System.out.println("length of longest palindromic subsequence is = "+solution.longestPalinSubseq(s));
    }
}