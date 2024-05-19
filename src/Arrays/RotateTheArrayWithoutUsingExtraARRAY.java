package Arrays;
import java.util.Scanner;
public class RotateTheArrayWithoutUsingExtraARRAY {
    public static void reverse(int[] array, int i, int j) {
        while (i<=j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int n = array.length;
        int k = sc.nextInt();
        k = k%n;
        reverse(array, 0,  n-k-1);
        reverse(array, n-k,n-1);
        reverse(array, 0,  n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");}

        //In LeetCode
//            public void reverse(int[] nums, int i, int j){
//                while(i<=j){
//                    int temp = nums[i];
//                    nums[i] =nums[j];
//                    nums[j]= temp;
//                    i++;
//                    j--;
//                }}
//            public void rotate(int[] nums, int k) {
//                int n =nums.length;
//                k =k%n;
//                reverse(nums, 0, n-k-1);
//                reverse(nums, n-k, n-1);
//                reverse(nums, 0 ,n-1);
//            }
//        }
//        }

    }
}