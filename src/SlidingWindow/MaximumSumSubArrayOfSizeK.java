package SlidingWindow;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k=3;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        //Brute Force
        for(int i=0; i<=n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
        //OptimIzed Code
        //Actual Sliding Window Technique - O(n)
        //First Time hume manually k tak loop chala kar sum nikalna hoga
        int sum =0;
        int i=0;
        int j=k-1;
        int maxSum = Integer.MIN_VALUE;
        for(int a=0; a<=k-1; a++){//O(k) //k times
            sum += arr[a];
        }
        maxSum = Math.max(sum, maxSum);
        i++;
        j++;
        while(j<n){//n-k times
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(sum,maxSum);
            i++;
            j++;
        }
        System.out.println(maxSum);
    }
}
