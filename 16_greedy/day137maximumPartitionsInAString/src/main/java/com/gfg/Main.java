package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String s = "ababcbacadefegdehijhklij";
        Solution solution = new Solution();
        int maxPartitions = solution.maxPartitions(s);
        System.out.println("maximum partitions for string: '"+s+"' with no common substring is = "+maxPartitions);

    }
}