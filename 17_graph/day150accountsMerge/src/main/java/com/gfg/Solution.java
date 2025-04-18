package com.gfg;
import java.util.*;

public class Solution {
    static ArrayList<ArrayList<String>> accountsMerge(
            ArrayList<ArrayList<String>> accounts) {
        HashMap<String, Integer> mails = new HashMap<>();
        int n = accounts.size();
        int[] parent = new int[n];
        for(int i=0;i<n;i++)
            parent[i] = i;
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String email = accounts.get(i).get(j);
                if(!mails.containsKey(email))
                    mails.put(email,i);
                else{
                    union(i,mails.get(email),parent);
                }
            }
        }
        ArrayList<ArrayList<String>> mergedMails = new ArrayList<>();
        for(int i=0;i<n;i++){
            mergedMails.add(new ArrayList<>());
        }
        
        for(String email:mails.keySet()){
            int node = findParent(mails.get(email),parent);
            String mail = email;
            mergedMails.get(node).add(mail);
        }

        ArrayList<ArrayList<String>> finalAccounts = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergedMails.get(i).isEmpty()){
                continue;
            }
            ArrayList<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            temp.addAll(mergedMails.get(i));
            finalAccounts.add(temp);
        }
        return finalAccounts;

    }
    private static int findParent(int node, int[] parent){
        if(node==parent[node])
            return node;
        parent[node] = findParent(parent[node],parent);
        return parent[node];
    }
    private static void union(int a, int b, int[] parent){
        int pa = findParent(a,parent);
        int pb = findParent(b,parent);
        if(pa==pb)
            return;
        parent[pa] = pb;
    }
}
