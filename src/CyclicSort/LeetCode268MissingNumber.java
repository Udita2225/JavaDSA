package CyclicSort;
// LeetCode 268 Missing Number
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is
missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it
does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it
does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it
does not appear in nums.
Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
*/
public class LeetCode268MissingNumber {
/*
// Using Maths
class Solution {
    public int missingNumber(int[] nums) {
    int n =  nums.length;
    int sum = 0;
    for(int i=0; i<n; i++) sum += nums[i];
    int total =  (n*(n+1))/2;
    return total-sum;
    }
}
/* Using Cycle Sort
class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int i=0;
    while(i<n){
        if(nums[i]==n || nums[i]==i) i++;
        // else if(nums[i]!=i) swap(i, nums[i],nums);
        else swap(i,nums[i],nums);
    }
    for(int j=0; j<n; j++) if(nums[j]!=j) return j;
    return n;
    }
}
/* By Using Extra Boolean Array
class Solution {
    public int missingNumber(int[] nums) {
    int n =  nums.length;
    boolean[] help =  new boolean[n+1];
    for(int i=0; i<n; i++) help[nums[i]] = true;
    for(int i=0; i<=n; i++) if(!help[i]) return i;
    return -1;
    }
}
/* By Using an Extra Integer Array
class Solution {
    public int missingNumber(int[] nums) {
    int n =  nums.length;
    int[] help =  new int[n+1];
    for(int i=0; i<n; i++) help[nums[i]] = 1;
    for(int i=0; i<=n; i++) if(help[i]==0) return i;
    return -1;
    }
}
/* Using HashSet
class Solution {
    public int missingNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int n = nums.length;
    for(int i=0; i<n; i++) set.add(nums[i]);
    for(int i=0; i<=n; i++) if(!set.contains(i)) return i;
    return -1;
    }
}
*/
}
