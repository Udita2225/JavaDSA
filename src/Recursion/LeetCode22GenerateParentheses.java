package Recursion;
import java.util.*;
public class LeetCode22GenerateParentheses {
/*
LeetCode22. Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]
Constraints:
1 <= n <= 8
*/
public static void printParentheses(int open, int close,int n,String s){
    int length =s.length();
    if(length==2*n){
        System.out.print(s+ " ");
        return;
    }
    if(open<n){
        printParentheses(open+1,close,n,s+"(");
    }
    if(close<open) {
        printParentheses(open,close+1,n,s+")");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = sc.nextInt();
    printParentheses(0,0,n,"");
 }
}
