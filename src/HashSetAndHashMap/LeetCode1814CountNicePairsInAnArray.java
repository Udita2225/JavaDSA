package HashSetAndHashMap;
//1814. Count Nice Pairs in an Array
public class LeetCode1814CountNicePairsInAnArray {
/*
You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the
non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies
all of the following conditions:
0 <= i < j < nums.length
nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
Example 1:
Input: nums = [42,11,1,97]
Output: 2
Explanation: The two pairs are:
 - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
Example 2:
Input: nums = [13,10,35,24,76]
Output: 4
Constraints:
1 <= nums.length <= 105
0 <= nums[i] <= 109
*/
/*
class Solution {
    public int rev(int num){
        int x = 0;
        while(num!=0){
            x = x*10 + num%10;
            num /= 10;
        }
        return x;
    }
    public int countNicePairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        int MOD =1000000007;
        for(int i=0; i<nums.length; i++){
            int x = nums[i]-rev(nums[i]);
            if(map.containsKey(x)){
                int freq = map.get(x);
                count = (count+freq)%MOD;
                map.put(x,freq+1);
                }
            else map.put(x,1);
        }
        return count;
    }
}
*/
/*Brute Force Not a Good Code TC : O(n^2)
class Solution {
    public int rev(int nums){
        int x =0;
        while(nums!=0){
            x = x*10+nums%10;
            nums /= 10;
        }
        return x;
    }
    public int countNicePairs(int[] nums) {
        int count=0;
        int MOD = 1000000007;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int a = rev(nums[i]);
                int b = rev(nums[j]);
                if(nums[i]+b==nums[j]+a) count = (count+1)%MOD;
            }
        }
        return count;
    }
}
*/
}
