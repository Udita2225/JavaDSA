package StringBuilderClass;

import java.util.Arrays;

public class ArrayOfStrings {
//    Kind of 2-D Array
public static void main(String[] args) {
    String[] arr = {"raghav", "garg", "skills", "laptop"};
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");//raghav garg skills laptop
    }
    System.out.println();
    System.out.println(arr); //[Ljava.lang.String;@5b480cf9 It does not work
    System.out.println(Arrays.deepToString(arr));//[raghav, garg, skills, laptop]
//    Collections override toString() → nicely formatted.
//    Arrays and raw objects do NOT → need helper functions or manual override.
//    Use utility methods:
//    Arrays.toString(arr) → for 1D arrays
//    Arrays.deepToString(arr) → for 2D or nested arrays

     }
}
