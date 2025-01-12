package com.gfg;

public class Solution {

    int countPairs(int arr[], int target) {
        int n = arr.length;
        int i = 0, j = n-1;
        int count = 0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum>target)
                j--;
            else if(sum<target)
                i++;
            else{
                int ele1 = arr[i], ele2 = arr[j];
                int cnt1 = 0, cnt2 = 0;
                while(i<=j && ele1==arr[i]){
                    cnt1++;
                    i++;
                }
                while(i<=j && ele2==arr[j]){
                    cnt2++;
                    j--;
                }
                if(ele1==ele2){
                    count += (cnt1*(cnt1-1))/2;
                    break;
                }
                else{
                    count += (cnt1*cnt2);
                }
            }
        }
        return count;
    }
}
