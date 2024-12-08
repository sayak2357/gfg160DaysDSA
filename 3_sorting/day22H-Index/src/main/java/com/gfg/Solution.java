package com.gfg;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int citation_count = citations[i];
            int more_citations_paper_count = n-i;
            if(citation_count>=more_citations_paper_count)
                ans = Math.max(ans,more_citations_paper_count);
        }
        return ans;
    }
}
