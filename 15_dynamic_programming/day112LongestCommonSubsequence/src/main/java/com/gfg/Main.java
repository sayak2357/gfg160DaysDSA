package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String s1 = "ABCDGH", s2 = "AEDFHR";
        Solution solution = new Solution();
        System.out.println("given strings:\n a = "+s1+"  b = "+s2);
        System.out.println("length of longest common subsequence = "+solution.lcs(s1,s2));
    }
}