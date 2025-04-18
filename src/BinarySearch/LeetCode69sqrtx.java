package BinarySearch;

public class LeetCode69sqrtx {
    public static void main(String[] args){
/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
Constraints:
0 <= x <= 231 - 1
*/
/*
This is the simplest and fastest solution but we don't have to use Built-In Functions.
This is even faster than Binary Search because it uses Newton Raphson Method for finding the square root
class Solution {
    public int mySqrt(int x) {
        return (int)(Math.sqrt(x)); //Typecasting , because in java it returns the exact
        // double value
    }
}
*/
/*
CORRECT SOLUTION
class Solution {
    public int mySqrt(int x) {
        //0<=sqrt(x)<=x
        long low = 0;
        long high=(long)x;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid ==(long)x) return (int)mid;
            else if(mid*mid>x) high =mid-1;
            else if(mid*mid<x) low = mid+1;
        }
    return (int)high; //Agar koi number perfect square nahi huwa to ye return ho jayega
    }
}

 */
    }
}
