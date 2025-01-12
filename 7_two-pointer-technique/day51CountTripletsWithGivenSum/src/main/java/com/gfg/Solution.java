package com.gfg;

public class Solution {
        public int countTriplets(int[] arr, int target) {
            int n = arr.length;
            int count = 0;
            for(int i=0;i<n-2;i++){
                int left = i+1;
                int right = n-1;
                while(left<right){
                    int tempSum = arr[i]+arr[left]+arr[right];
                    if(tempSum<target){
                        left++;
                    }
                    else if(tempSum>target){
                        right--;
                    }
                    else{
                        int ele1 = arr[left];
                        int ele2 = arr[right];
                        int cnt1 = 0;
                        int cnt2 = 0;
                        while(left<=right && arr[left]==ele1)
                        {
                            left++;
                            cnt1++;
                        }
                        while(left<=right && arr[right]==ele2)
                        {
                            right--;
                            cnt2++;
                        }
                        if(ele1==ele2){
                            count += (cnt1*(cnt1-1))/2;
                        }
                        else{
                            count += cnt1*cnt2;
                        }

                    }

                }

            }
            return count;
        }


}
