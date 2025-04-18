package com.gfg;

import java.util.*;
public class Solution {
    public String findOrder(String[] words) {
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, List<Character>> graph = new HashMap<>();
        for(String word:words){
            for(Character c:word.toCharArray()){
                inDegree.put(c,0);
                graph.put(c, new ArrayList<>());
            }
        }
        for(int i=0;i<words.length-1;i++){
            String first = words[i];
            String second = words[i+1];
            // if(first.length()>second.length() && first.charAt(0)==second.charAt(0))
            // {
            //     return "";
            // }
            int len = Math.min(first.length(),second.length());
            for(int j=0;j<len;j++){
                char outEdge = first.charAt(j);
                char inEdge = second.charAt(j);
                if(outEdge!=inEdge){
                    graph.get(outEdge).add(inEdge);
                    inDegree.put(inEdge,inDegree.get(inEdge)+1);
                    break;
                }
            }
        }
        String output = "";
        Queue<Character> q = new LinkedList<>();
        for(char c:inDegree.keySet()){
            if(inDegree.get(c)==0){
                q.offer(c);
            }
        }
        while(!q.isEmpty()){
            char out = q.poll();
            output += String.valueOf(out);
            for(char nh:graph.get(out)){
                inDegree.put(nh, inDegree.get(nh)-1);
                if(inDegree.get(nh)==0){
                    q.offer(nh);
                }
            }
        }


        return graph.keySet().size()==output.length()?output:"";
    }
}
