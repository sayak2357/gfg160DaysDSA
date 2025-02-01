package com.gfg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        int capacity, queryCount;
        capacity = sc.nextInt();
        queryCount = sc.nextInt();
        LRUCache lruCache = new LRUCache(capacity);
        for(int i=0;i<queryCount;i++){
            String[] ip = sc.nextLine().split(" ");
            String op = ip[0];
            int val1=-1,val2=-1;
            switch (op){
                case "GET": val1 = Integer.parseInt(ip[1]);
                            System.out.println(lruCache.get(val1));
                            break;
                case "PUT": val1 = Integer.parseInt(ip[1]);
                            val2 = Integer.parseInt(ip[2]);
                            lruCache.put(val1,val2);
                            break;
            }
        }
    }
}