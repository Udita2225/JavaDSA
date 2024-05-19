package ArrayLists;

import java.util.ArrayList;
/*
Built-in methods:-
arr.size();  tells the size of arraylist;
arr.add(0,30); 0-index, 30-initialised this value
arr.set(0,50); 0-index, 50-update/modify value at index 0
arr.add(90);   pushes 90 to the end of the arraylist
arr.remove(4)  4-INDEX No. It removes the element at index 4 from arraylist
System.out.println(arr); Prints the complete arraylist in an arranged manner;
 */

public class BasicOperationsOnArrayList {
    public static void main(String[] args) {
        /*int[] arr =new int[];
          int[] arr = {1,2,3};
          double[] brr ={3.14, 4.5, 3.4 }
         */
       // For ArrayList we have to write WrapperClass <Integer>
        ArrayList<Integer> arr = new ArrayList<>(6);
        //Memory me ye bhi  6 size ka ek  array hi bana hai jiske index bhi array ki tarah 0 to 6-1(5) hai;
        //Initializing
        arr.add(0,10);//arr[0] =10;
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        //If we skip one index then it will show error
        //yaha par default values 0 nahi hoti hain
        //It is important to initialize all elements
        //Printing
        System.out.println(arr.get(0)); //arr[0];
        for(int i =0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " "); //arr[i]
        }
        System.out.println();
        System.out.println(arr);
        System.out.println(arr.size());
        ;//We can directly print the whole arraylist using this built-in method
        //This built-in method prints the arraylist more beautifully automatically
        //eg- [10, 20, 30, 40, 50, 60]


        //MODIFYING THE ELEMENTS:-
        arr.set(2,300);           //modifing value at index 2
        System.out.println(arr);

        //Benefits of array:-

        //We can easily increase the size of arraylist unlike array

        arr.add(90);//push back
        System.out.println(arr.size());
        System.out.println(arr);


     //yaha par 90 add karne ke liye index nhi likhna parega
     //90, piche se add ho jayega arraylist me .. size of array gets changed automatically
    // [10,20,300,40,50,60,90]




    }
}
