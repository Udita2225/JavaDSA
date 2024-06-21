package MultiDimensionalArrayAndArrayList;
import java.util.List;
import ArrayLists.ArrayListAdd;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;      //ye saari libraries ko  include kar leta hai
public class BasicSTLFunctionsinArrayList {
    public static void main(String[] args) {
        /*
        add()     Add at Back
        remove()  Remove From Back
        get()
        size()
        clear()   Clears The ArrayList
        isEmpty()
        Contains()
        indexOf()
        toArray() Convert 1-D ArrayList to ARRAY
        set() Agar hume kisi index ke number ko update karna hai to set ko use karenge naa ki get ko
        Pehli value daalne ke liye to get ka use kar sakte hain but agar usi value ko update karna ho to set ka use karenge
         */
        //ArrayList<Integer> arr = new ArrayList<>();//1-D Array
        //Yaha par LHS me ArrayList ki jagah sirf List bhi likh sakte hain
        List<Integer> a =  new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b=  new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c =  new ArrayList<>();
        List<Integer> d =  new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();//ye bhi ek arraylist hi hai but ye arraylists ki arraylist hai
         l.add(a); l.add(b); l.add(d);

        //Indexing
        /*
              0   1   2           0   1                  0
        a = {10, 20, 30}     b ={40, 50}   c = {}   d ={60}

                    0            1      2   3
        l  = {{10, 20, 30} , {40, 50}, {},{60}}
        0   1  2
     0  10 20 30
     1  40 50
     2
     3  60
*/
        System.out.println(l.get(0).get(1));
        for(int i =0; i<a.size(); i++){
            System.out.print(a.get(i)+ " "); //get()
        }
        System.out.println();
        for(int i =0; i<l.size(); i++){
            System.out.println(l.get(i)+ " ");
        } /* Ye to poora array hi print kar raha hai agar isme bhi hume specifically koi ek element print karna hai to hum
        l.get(1).get(1) pehla get(1) Row first ke liye hai ...Doosra get(1) Column 1st ke liye hai
         [10, 20, 30]
         [40, 50]
         []
         [60]*/
        System.out.println(l.get(0).get(0));
          //Best METHOD
        for(int i =0; i<l.size(); i++){
            List<Integer> x = l.get(i);
            for(int j =0; j<x.size(); j++){//Can be written as l.get(i).size()
                System.out.print(x.get(j)+ " ");
            }
            System.out.println();
        }
        //This is completely wrong->
//        for(int i = 0; i<l.size(); i++){//Since yaha par columns variable hain we cannot use j loop directly
//            for(int j =0 ; j<a.size(); j++){
//                System.out.print(l[i][j]+"");
//            }
//  }






    }
}
