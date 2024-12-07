package com.github;

public class Solution {
    public int getSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num>secondLargest && num<largest){
                secondLargest = num;
            }
        }
        return secondLargest==Integer.MIN_VALUE?-1:secondLargest;
    }
}
