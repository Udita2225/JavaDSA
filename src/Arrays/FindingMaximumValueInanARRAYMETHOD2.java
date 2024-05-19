package Arrays;
import java.util.Scanner;
public class FindingMaximumValueInanARRAYMETHOD2 {
    public static void main(String[] args) {
        //Integer.MIN_VALUE; it gives the minimum value from the given array
        int[] arr= {-18, -8, -4, 78 , 98, -5};
        int n =arr.length;
        int max= Integer.MIN_VALUE;//sbse chhoti value hai ye- -2147483648
        System.out.println(max);
        for(int i =0; i<n; i++) {
           // if (arr[i]> max) max=arr[i];
            max = Math.max(max, arr[i]); //Most generic method
        }
        System.out.println(max);
        }


    }

