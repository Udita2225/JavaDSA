package Stacks_Infix_Prefix_Postfix;

public class LeetCode239SlidingWindowMaxBadCode {
/*
LeetCode 239. Sliding Window Maximum
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of
the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right
by one position.
Return the max sliding window.
Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:
Input: nums = [1], k = 1
Output: [1]
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length
*/
public static void main(String[] args) {
/*
Bad Code
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z=0;
        for(int i=0; i<n-k+1; i++){//n-k+1 times
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){//k times
                max = Math.max(max, nums[j]);
            }
            ans[z] =max;
            z++;
        }
        //Time Complexity O(k*(n-k+1)) -> O(k*n)
        return ans;
    }
}
*/

    }
}
