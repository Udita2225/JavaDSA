package Arrays;

public class InitialisingArrayUsingDifferentMethod {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 5, 3, 4, 5, 6};//initialising directly
        int n = arr.length;//no braces
        System.out.println(n);
        //length operator
        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
        }

        //agar bahot saari values daal di humne to count karna mushkil hoga
        //for that we retrieve;
        //arr.length();


    }
}
