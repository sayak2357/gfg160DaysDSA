package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String s = "abaab";
        Solution solution = new Solution();
        System.out.println("given input string: "+s);
        System.out.println("number of pandromic substrings of length greater equal to 2 is = "+solution.countPS(s));
    }
}