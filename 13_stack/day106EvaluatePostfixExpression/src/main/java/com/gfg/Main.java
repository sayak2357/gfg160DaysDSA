package com.gfg;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String[] expr = new String[]{"2", "3", "1", "*", "+", "9", "-"};
        Solution solution = new Solution();
        int value = solution.evaluate(expr);
        System.out.println("given postfix expression: "+ Arrays.asList(expr));
        System.out.println("evaluated value of the expression is = "+value);
    }
}