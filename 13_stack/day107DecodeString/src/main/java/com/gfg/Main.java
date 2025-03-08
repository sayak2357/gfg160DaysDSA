package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        //String s = "3[b2[ca]]";
        String s = "1[nqsvw]9[yh]4[vw]";
        Solution solution = new Solution();
        String decoded = solution.decodeString(s);
        System.out.println(decoded);
    }
}