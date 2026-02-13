package DailyChallengePracticeQuestions;
/*
3583. Count Special Triplets
You are given an integer array nums.
A special triplet is defined as a triplet of indices (i, j, k) such that:
0 <= i < j < k < n, where n = nums.length
nums[i] == nums[j] * 2
nums[k] == nums[j] * 2
Return the total number of special triplets in the array.
Since the answer may be large, return it modulo 109 + 7.
Example 1:
Input: nums = [6,3,6]
Output: 1
Explanation:
The only special triplet is (i, j, k) = (0, 1, 2), where:
nums[0] = 6, nums[1] = 3, nums[2] = 6
nums[0] = nums[1] * 2 = 3 * 2 = 6
nums[2] = nums[1] * 2 = 3 * 2 = 6
Example 2:
Input: nums = [0,1,0,0]
Output: 1
Explanation:
The only special triplet is (i, j, k) = (0, 2, 3), where:
nums[0] = 0, nums[2] = 0, nums[3] = 0
nums[0] = nums[2] * 2 = 0 * 2 = 0
nums[3] = nums[2] * 2 = 0 * 2 = 0
Example 3:
Input: nums = [8,4,2,8,4]
Output: 2
Explanation:
There are exactly two special triplets:
(i, j, k) = (0, 1, 3)
nums[0] = 8, nums[1] = 4, nums[3] = 8
nums[0] = nums[1] * 2 = 4 * 2 = 8
nums[3] = nums[1] * 2 = 4 * 2 = 8
(i, j, k) = (1, 2, 4)
nums[1] = 4, nums[2] = 2, nums[4] = 4
nums[1] = nums[2] * 2 = 2 * 2 = 4
nums[4] = nums[2] * 2 = 2 * 2 = 4
Constraints:
3 <= n == nums.length <= 105
0 <= nums[i] <= 105
*/
public class LeetCode3583CountSpecialTriplets {
    public static void main(String[] args) {
    /*
    class Solution {
    public int specialTriplets(int[] nums) {
    HashMap<Integer, Integer> leftFreqMap =  new HashMap<>();
    HashMap<Integer, Integer> rightFreqMap =  new HashMap<>();
    int MOD = 1_000_000_007;
    for(int ele:nums) rightFreqMap.put(ele, rightFreqMap.getOrDefault(ele,0)+1);
    long count = 0;
    for(int i=0; i<nums.length; i++){
        int twice = 2*nums[i];
        if(rightFreqMap.containsKey(nums[i])){
            int freq = rightFreqMap.get(nums[i]);
            freq--;
            if(freq==0) rightFreqMap.remove(nums[i]);
            else rightFreqMap.put(nums[i],freq);
        }
        if(leftFreqMap.containsKey(twice) && rightFreqMap.containsKey(twice)){
            int leftFreq = leftFreqMap.get(twice);
            int rightFreq = rightFreqMap.get(twice);
            count = (count + ((long)leftFreq *(long)rightFreq)%MOD) % MOD;
        }
        leftFreqMap.put(nums[i],leftFreqMap.getOrDefault(nums[i],0)+1);
    }
    return (int)count;
    }
}
/* This Gives Time Limit Exceeded Error
// Brute Force
class Solution {
    public int specialTriplets(int[] nums) {
    int n = nums.length;
    int count = 0;
    int MOD = 1_000_000_007;
    for(int i=0; i<n-2; i++){
        for(int j=i+1; j<n-1; j++){
            for(int k=j+1; k<n; k++){
                if(nums[i]== 2*nums[j] && nums[k]==2*nums[j]){
                    count = (count+1)%MOD;
                }
            }
        }
    }
    return count;
    }
}
*/

    }
}
