package comf.gfg;

public class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int leftMostIndex = -1, rightMostIndex = -1;
        int left =0, right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>target)
                right = mid-1;
            else if(arr[mid]<target)
                left = mid+1;
            else{
                leftMostIndex = mid;
                right = mid-1;
            }
        }
        left = 0;
        right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>target)
                right = mid-1;
            else if(arr[mid]<target)
                left = mid+1;
            else{
                rightMostIndex = mid;
                left = mid+1;
            }
        }
        //System.out.println(leftMostIndex+" "+rightMostIndex);
        return leftMostIndex==-1 ? 0:rightMostIndex-leftMostIndex+1;
    }
}

