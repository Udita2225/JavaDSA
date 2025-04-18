package Recursion;
import java.util.*;

/*Given an integer array nums of unique elements, return all possible
subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.*/

public class LeetCode78SubsetsOfArray {
    static List<List<Integer>> arr;
    public static void helper(int i, int[] nums, ArrayList<Integer> ans){
    if(i==nums.length){
        //Deep Copy
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<ans.size(); j++){
            list.add(ans.get(j));
        }
        arr.add(list);
        return;
    }
    helper(i+1,nums,ans);//not take
    ans.add(nums[i]);
    helper(i+1,nums,ans);//take
    ans.remove(ans.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,nums,ans);
        return arr;
    }
    public static void main(String[] args) {
     int[] nums = {1,2,3};
     subsets(nums);
     System.out.print(arr);
    }
}
//Output
//[[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]