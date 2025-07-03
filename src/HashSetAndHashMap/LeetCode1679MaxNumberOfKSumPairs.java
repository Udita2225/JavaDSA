package HashSetAndHashMap;
//1679. Max Number of K-Sum Pairs
/*
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose
sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
Example 1:
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:
Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.
Constraints:
1 <= nums.length <= 105
1 <= nums[i] <= 109
1 <= k <= 109
*/
/*
class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int key: nums){
            int complement = k-key;
            if(map.getOrDefault(complement,0)>0){
                //Pair found
                count++;
                map.put(complement, map.get(complement)-1);
            }
            else{
                //Store this Number for future pairing
                map.put(key, map.getOrDefault(key,0)+1);
            }
        }
        return count;
    }
}
/*class Solution {
    public int maxOperations(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count=0;
    for(int i=0; i<nums.length; i++){
    int complement = k-nums[i];
    if(map.containsKey(complement) && map.get(complement)>0){
        count++;
        map.put(complement, map.get(complement)-1);
    }
    else{
        if(map.containsKey(nums[i])){
            int freq = map.get(nums[i]);
            map.put(nums[i], freq+1);
        }
        else map.put(nums[i],1);
    }
    }
    return count;
    }
}
*/
/*
public class LeetCode1679MaxNumberOfKSumPairs {
    class Solution {
        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int i,j;
            i=0;
            j=nums.length-1;
            int count=0;
            while(i<j){
                if(nums[i]+nums[j]<k) i++;
                else if(nums[i]+nums[j]>k) j--;
                else if(nums[i]+nums[j]==k){
                    i++;
                    j--;
                    count++;
                }
            }
            return count;
        }
    }
}
*/