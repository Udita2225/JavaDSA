package Arrays;

public class MinimumValueINArray {
    public static void main(String[] args) {
        int[] arr= {-18, -8, -4, 78 , 98, -5};
        int n =arr.length;
//        int min = Integer.MAX_VALUE;
//        System.out.println(min); //MAX VALUE =2147483647
//        for(int i =0; i<n; i++){
//            min = Math.min(min, arr[i]);
//        }
//        System.out.println(min);
    int min = arr[0];
    for(int i =1; i<n; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
        System.out.println(min);
    }
}
