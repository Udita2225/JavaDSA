package Arrays;

public class SwapTheNumberUsingArrays {
    public static void main(String[] args) {
        int[] num =new int[26];
        num[0] = 100;
        num[25] =200;
        //Now swapping these numbers using third variable
        int temp = num[25];
        num[25]= num[0];
        num[0] = temp;
        System.out.println("\n" + num[0]+ " "+ num[25]);
        // \n next line  me turant aa jao
        // println ka matlab hai pehle print kardo fir next line me aa jao
        int[] arr = new int[5];
        for(int i =0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
//
}
