package Stacks_Interview_Questions;

public class LeetCode84LargestRectangleInHistogram {
/*
84. Largest Rectangle in Histogram
Given an array of integers heights representing the histogram's bar height
where the width of each bar is 1, return the area of the largest rectangle in the histogram.
Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:
Input: heights = [2,4]
Output: 4
Constraints:
1 <= heights.length <= 105
0 <= heights[i] <= 104
*/
    public static void main(String[] args) {
    /*
    class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        //calculate nse[] from right to left
        st.push(n-1);
        nse[n-1] = n;
        for(int i=n-2; i>=0; i--){
            while(st.size()!=0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) nse[i]=n;
            else nse[i] = st.peek();
            st.push(i);
        }
        //Empty the stack
        while(st.size()>0) st.pop();
        //calculating pse[] from left to right
        st.push(0);
        pse[0] =-1;
        for(int i=1; i<n; i++){
            while(st.size()!=0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else pse[i] = st.peek();
            st.push(i);
        }
        //Maximum Area Of Rectangle
        int max =-1;
        for(int i=0; i<n; i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            max = Math.max(max, area);
        }
    return max;
    }
}
     */
    }
}
