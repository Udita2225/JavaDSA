package HashMaps;
/*
2442. Count Number of Distinct Integers After Reverse Operations
You are given an array nums consisting of positive integers.
You have to take each integer in the array, reverse its digits, and add it to the end of the array.
You should apply this operation to the original integers in nums.
Return the number of distinct integers in the final array.
Example 1:
Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after
reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
Example 2:
Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).
Constraints:
1 <= nums.length <= 105
1 <= nums[i] <= 106
*/
public class LeetCode2442CountNoOfDistinctIntAfterRev {
/*
// Sir's method More effective and concise
class Solution {
    public int reverse(int n){
    int r=0;
    while(n!=0){
        r = r*10 + n%10;
        n /= 10;
    }
    return r;
    }
    public int countDistinctIntegers(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<nums.length; i++){
        set.add(nums[i]);
        set.add(reverse(nums[i]));
    }
    return set.size();
    }
}


This is what I thought initially. This is not a good code
class Solution {
     public int rev(int k, int[] arr){
        int p = arr[k];
        int rem = p%10;
        int quo = p/10;
        String str = ""+rem;
        while(quo!=0){
            rem = quo%10;
            quo = quo/10;
            str += rem;
        }
        return Integer.parseInt(str);
        }
     public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums,2*n);
        int m = ans.length;
        for(int i=0; i<n; i++){
        ans[i+n] = rev(i,nums);
        }
//      Method 1. By Using HashSet
//      HashSet<Integer> set = new HashSet<>();
//      for(int j=0; j<m; j++){
//          set.add(ans[j]);
//      }
//      return set.size();

//      Method 2: Without Using HashSet
//      Arrays.sort(ans);
//      ArrayList<Integer> helper = new ArrayList<>();
//      int i=0,j=1;
//      while(i<j && j<m){
//      if(ans[i]!=ans[j]) helper.add(ans[i]);
//      i++;
//      j++;
//      }
//      helper.add(ans[i]);
//      return helper.size();

//      Method 3. Without Using ArrayList
//      int count=1;
//      for(int i=1; i<m; i++){
//      if(ans[i-1]!=ans[i]) count++;
//      }
//      return count;
    }
}
*/
}
