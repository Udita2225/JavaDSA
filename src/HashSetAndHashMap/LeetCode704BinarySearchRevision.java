package HashSetAndHashMap;

public class LeetCode704BinarySearchRevision {
/*
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            // int mid = (lo+hi)/2;
            int mid = (hi-lo)/2 +lo;//To avoid integer overflow error
            if(nums[mid]>target) hi=mid-1;
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]==target) return mid;
        }
        return -1;
    }
}
*/
}
