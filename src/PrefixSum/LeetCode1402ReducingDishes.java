package PrefixSum;
//1402. Reducing Dishes
public class LeetCode1402ReducingDishes {
/*
A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by
its satisfaction level i.e. time[i] * satisfaction[i].
Return the maximum sum of like-time coefficient that the chef can obtain after preparing some amount of dishes.
Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
Example 1:
Input: satisfaction = [-1,-8,0,5,-9]
Output: 14
Explanation: After Removing the second and last dish, the maximum total like-time coefficient will be equal to (-1*1 + 0*2 + 5*3 = 14).
Each dish is prepared in one unit of time.
Example 2:
Input: satisfaction = [4,3,2]
Output: 20
Explanation: Dishes can be prepared in any order, (2*1 + 3*2 + 4*3 = 20)
Example 3:
Input: satisfaction = [-1,-4,-5]
Output: 0
Explanation: People do not like the dishes. No dish is prepared.
Constraints:
n == satisfaction.length
1 <= n <= 500
-1000 <= satisfaction[i] <= 1000
*/
/*
//Without Extra Array and Suffix Sum
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
    Arrays.sort(satisfaction);
    int n =  satisfaction.length;
    int suffixSum = 0;
    int total = 0;
    int result = 0;
    for(int i=n-1; i>=0; i--){
        suffixSum += satisfaction[i];
        if(suffixSum>0){
            total += suffixSum;
            result = total;
        }
        else break;
    }
    return result;
    }
}
*/
/*class Solution {
    public int maxSatisfaction(int[] satisfaction) {
    Arrays.sort(satisfaction);
    int n = satisfaction.length;
    int[] arr = new int[n];
    arr[n-1] = satisfaction[n-1];
    for(int i=n-2; i>=0; i--){
        arr[i] = satisfaction[i] + arr[i+1];
    }
    if(arr[n-1]<=0) return 0;
    int end = n-1;
    int start = 0;
    for(int i=n-2; i>=0; i--){
        if(arr[i]>0) start=i;
    }
    int x=0;
    int sum=0;
    for(int i=start; i<=end; i++){
        x++;
        sum += x*satisfaction[i];
    }
    return sum;
    }
}
*/

}
