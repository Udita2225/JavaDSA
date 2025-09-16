package DynamicProgrammingKnapSack;
// Basic Recursion
//  TC:-  O(2^n)
//  AS:-  O(n*c)
public class KnapSack01PureRecursion {
    public static int profit(int i,int[] wt, int[] val, int capacity){
    if(i==wt.length) return 0;
    int skip = profit(i+1,wt,val,capacity);
    if(wt[i]>capacity) return skip;
    int pick = val[i] + profit(i+1, wt,val,capacity-wt[i]);
    return Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt  = {1,2,8,10};
        int capacity = 8;
        // i  =  0 to n-1  and capacity = capacity to 0
        System.out.println(profit(0,wt,val,capacity));
    }
}
