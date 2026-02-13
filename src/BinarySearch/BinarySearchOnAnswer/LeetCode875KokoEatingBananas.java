package BinarySearch.BinarySearchOnAnswer;
/*
875. Koko Eating Bananas
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and
will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas
from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas
during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23
Constraints:
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
*/
public class LeetCode875KokoEatingBananas {
    /*
    class Solution {
    public boolean canFinish(int num, int h, int[] piles){
        long totalhours = 0;
        for(int i=0; i<piles.length; i++){
            int hours = piles[i]/num;
            if(piles[i]%num!=0) totalhours += hours+1;
            else totalhours += hours;

        }
        return totalhours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
    int n =  piles.length;
    int maxPile = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        maxPile = Math.max(maxPile,piles[i]);
    }
    int low = 1;
    int high = maxPile;
    while(low<=high){
        int mid = low + (high-low)/2;
        // int mid =  (high+low)/2;
        if(canFinish(mid,h,piles)) high = mid-1;
        else low =  mid+1;
    }
    return low;
    }
}
    */
}
