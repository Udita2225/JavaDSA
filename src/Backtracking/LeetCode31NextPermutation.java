package Backtracking;
/*
31. Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.



Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100


Seen this question in a real interview before?
1/5
Yes
No
Accepted
2,207,566/4.9M
Acceptance Rate
44.9%

*/
public class LeetCode31NextPermutation {
    /*
    class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] =  nums[j];
        nums[j] = temp;
    }
    public void reverse(int i, int j , int[] nums){
        while(i<j){
        swap(i,j,nums);
        i++;
        j--;
        }
    }
    public void nextPermutation(int[] nums) {
    int n  =  nums.length;
    int pivot = -1;
    // Find the pivot index
    for(int i=n-2; i>=0; i--){
        if(nums[i]<nums[i+1]){
             pivot = i;
             break;
        }
    }
    // If the nums array is in descending order
    if(pivot == -1){
        reverse(0,n-1,nums);
    }
    // If pivot is found
    else{
        int nextgreater = Integer.MAX_VALUE;
        int ngIdx = -1;
        for(int i=pivot+1; i<nums.length; i++){
            if(nums[i]> nums[pivot] && nums[i]<=nextgreater){
                nextgreater = nums[i];
                ngIdx = i;
            }
        }
        swap(pivot,ngIdx,nums);
        reverse(pivot+1,n-1,nums);
    }
    }
}
/*
This code will give memory limit exceeded
class Solution {
    public void permutations(int[] nums, List<Integer> arr, List<List<Integer>> ans, boolean[] used){
        if(nums.length==arr.size()){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]==true) continue;
            used[i] = true;
            arr.add(nums[i]);
            permutations(nums,arr,ans,used);
            arr.remove(arr.size()-1);
            used[i] = false;
        }
    }
    public void nextPermutation(int[] nums) {
    int n =  nums.length;
    List<Integer> target =  new ArrayList<>();
    for(int i=0; i<n; i++){
        target.add(nums[i]);
    }
    Arrays.sort(nums);
    List<Integer> arr =  new ArrayList<>();
    List<List<Integer>> ans =  new ArrayList<>();
    boolean[] used =  new boolean[n];
    permutations(nums,arr,ans,used);
    int idx =0;
    for(int i=0; i<ans.size(); i++){
        if(ans.get(i).equals(target)){
             idx = i+1;
        }
    }
    if(idx==ans.size()){
        List<Integer> l1 = ans.get(0);
        for(int i=0; i<n; i++){
            nums[i] = l1.get(i);
        }
    }
    else{
        List<Integer> l1 = ans.get(idx);
        for(int i=0; i<n; i++){
            nums[i] = l1.get(i);
        }
    }
    }
}
*/

}
