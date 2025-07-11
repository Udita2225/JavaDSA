package Heaps1;

public class LeetCode658FindKClosestElementsBinarySearch {
    /*class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            List<Integer> ans = new ArrayList<>();
            int n = arr.length;
            if(n==k){
                for(int val:arr){
                    ans.add(val);
                }
                return ans;
            }
            if(x<arr[0]){
                for(int i=0; i<k; i++){
                    ans.add(arr[i]);
                }
                return ans;
            }
            else if(x>arr[n-1]){
                for(int i=n-1; i>=n-k; i--){
                    ans.add(arr[i]);
                }
                Collections.sort(ans);
                return ans;
            }
            int lb =n;
            int low =0;
            int high =n-1;
            while(low<=high){
                int mid =  low + (high-low)/2;
                if(arr[mid]>=x){
                    lb = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }
            int j=lb, i=lb-1;
            while(k>0 && i>=0 && j<n) {
                int di = Math.abs(x-arr[i]);
                int dj = Math.abs(x-arr[j]);
                if(di<=dj){
                    ans.add(arr[i]);
                    i--;
                }
                else{
                    ans.add(arr[j]);
                    j++;
                }
                k--;
            }
            while(i<0 && k>0){
                ans.add(arr[j]);
                j++;
                k--;
            }
            while(j==n && k>0){
                ans.add(arr[i]);
                i--;
                k--;
            }
            Collections.sort(ans);
            return ans;
        }
    }*/

}
