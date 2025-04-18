package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class GFGTheCelebrityProblem {
/*
A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some
people.  A square matrix mat (n*n) is used to represent people at the party such that if an element of row i and column
j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the
celebrity does not exist, return -1.
Note: Follow 0-based indexing.
Examples:
Input: mat[][] = [[0 1 0], [0 0 0], [0 1 0]]
Output: 1
Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.
Input: mat[][] = [[0 1], [1 0]]
Output: -1
Explanation: The two people at the party both know each other. None of them is a celebrity.
Input: mat[][] = [[0]]
Output: 0
Constraints:
1 <= mat.size()<= 3000
0 <= mat[i][j]<= 1
*/
public static void main(String[] args) {
/*
// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(mat[v1][v2]==0){//shayad v1 celeb ho v2 to celeb bilkul bhi nahi hai
               st.push(v1);
            }
            else if(mat[v2][v1]==0){//shayad v2 celeb ho but v1 to celeb bilkul bhi nahi hai
                st.push(v2);
            }
        }
        if(st.size()==0) return -1;
        int potential = st.pop();
        for(int j=0; j<n; j++){
            if(mat[potential][j]==1) return -1;
        }
        for(int i=0; i<n; i++){
            if(i==potential) continue;
            if(mat[i][potential]==0) return -1;
        }
        return potential;

    }
}
*/
}
}
