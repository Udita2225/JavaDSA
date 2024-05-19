package ArrayLists;
import java.util.Arrays;
public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " ");}
        System.out.println();
        Arrays.sort(arr);
        //Sort means arranging in Ascending Order.
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //For-each Loop
        for(int ele : arr){
            System.out.print(ele + " ");
            //yaha par ele har ek element of array ko show karta hai
            /*
            arr - array ka name
            ele -  each element of array (yaha par ele ki jagah x bhi le sakte hain)
            ek ek karke saare elements print ho jaenge array ke
            yaha par initialize ya size of array dene ki jarurat nah padti
            Use-
            Jab hum data structure me padi hui values ko print karna chahte ho
             */

        }



    }
}
