package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String digits = "123";
        Solution solution = new Solution();
        int decodedMessageCount = solution.countWays(digits);
        System.out.println("number of decoded messages possible for: '"+digits+"' is = "+decodedMessageCount);
    }
}