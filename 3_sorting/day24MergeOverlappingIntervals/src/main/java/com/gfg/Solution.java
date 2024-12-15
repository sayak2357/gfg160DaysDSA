package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
public List<int[]> mergeOverlap(int[][] arr) {
    Arrays.sort(arr,(x, y) -> x[0]-y[0]);
    List<int[]> res = new ArrayList<>();
    int n = arr.length;
    int prevStart = arr[0][0],prevEnd = arr[0][1];
    for(int i=1;i<n;i++){
        int start = arr[i][0];
        if(start<=prevEnd)
        {
            prevEnd = Math.max(prevEnd,arr[i][1]);
        }
        else{
            int[] temp = new int[]{prevStart,prevEnd};
            res.add(temp);
            prevStart = start;
            prevEnd = arr[i][1];
        }
    }
    if(res.size()==0 || prevEnd!=res.get(res.size()-1)[1])
    {
        int[] temp = new int[]{prevStart,prevEnd};
        res.add(temp);
    }
    return res;
}
}
