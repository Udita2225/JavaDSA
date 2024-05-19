package Arrays;

public class SumOfTheElementsOfArrays {
    public static void main(String[] args) {
        int[]  arr= {4,6,78,66,54,34,48,89};
        int sum =0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
