package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HouseDistTuple{
    public int x,y,dist;
    public HouseDistTuple(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getDist(){
        return dist;
    }
}

public class Solution {

    public int minCost(int[][] houses) {
        int n = houses.length;
        int minDist = 0;
        List<HouseDistTuple> houseDistTuples = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x1 = houses[i][0];
            int y1 = houses[i][1];
            for(int j=i+1;j<n;j++){
                int x2 = houses[j][0];
                int y2 = houses[j][1];
                int dist = Math.abs(x1-x2)+Math.abs(y1-y2);
                houseDistTuples.add(new HouseDistTuple(i,j,dist));
            }
        }
        Collections.sort(houseDistTuples,(a, b)->a.getDist()-b.getDist());
        int[] parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        int edgeCount = 0;
        int edgeCountLimit = n-1;
        for(HouseDistTuple houseDistTuple:houseDistTuples){
            int a = houseDistTuple.getX();
            int b = houseDistTuple.getY();
            int tempDist = houseDistTuple.getDist();
            int pa = getParent(a,parent);
            int pb = getParent(b,parent);
            if(pa!=pb){
                minDist+=tempDist;
                edgeCount++;
                union(pa,pb,parent);
            }
            if(edgeCount==edgeCountLimit){
                break;
            }
        }
        return minDist;
    }
    private int getParent(int a, int[] parent){
        if(a==parent[a])
            return a;
        parent[a] = getParent(parent[a],parent);
        return parent[a];
    }
    private void union(int pa, int pb,int[] parent){
        parent[pa] = pb;
    }
}
