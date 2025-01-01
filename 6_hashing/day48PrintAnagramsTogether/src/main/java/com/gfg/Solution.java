package com.gfg;

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> anagramMap = new HashMap<>();
        for(String word:arr){
            char[] w = word.toCharArray();
            Arrays.sort(w);
            String sortedWord = new String(w);
            if(anagramMap.containsKey(sortedWord))
                anagramMap.get(sortedWord).add(word);
            else{
                ArrayList<String> tempList = new ArrayList<>();
                tempList.add(word);
                anagramMap.put(sortedWord,tempList);
            }
        }
        List<String> keys = new ArrayList<>();
        for(String key:anagramMap.keySet()){
            keys.add(key);
        }
        Collections.sort(keys);
        for(String key:keys){
            res.add(anagramMap.get(key));
        }
        return res;
    }
}
