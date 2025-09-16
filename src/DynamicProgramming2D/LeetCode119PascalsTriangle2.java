package DynamicProgramming2D;
//119. Pascal's Triangle II
/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:
Input: rowIndex = 0
Output: [1]
Example 3:
Input: rowIndex = 1
Output: [1,1]
Constraints:
0 <= rowIndex <= 33
Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
*/
public class LeetCode119PascalsTriangle2 {
/*
class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<List<Integer>> ans = new ArrayList<>();
    for(int i=0; i<=rowIndex; i++){
        List<Integer> arr = new ArrayList<>();
        for(int j=0; j<=i; j++){
            if(j==0 || j==i) arr.add(1);
            else arr.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
        }
        ans.add(arr);
    }
    return ans.get(rowIndex);
    }
}
*/
}
