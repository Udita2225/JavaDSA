package HashMaps;
import java.util.ArrayList;
import java.util.HashSet;
public class BasicSetIntro {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        //Insert
        //add() - TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        //size() - TC = O(1)
        System.out.println(set.size());//3
        set.add(-8);
        set.add(-200);
        System.out.println(set);//[20, 100, -8, -200, 10] O(n)
        //Search - true/false
        //contains() :TC = O(1)
        System.out.println(set.contains(100));//true
        System.out.println(set.contains(50));//false
        set.add(50);
        System.out.println("Size is " + set.size());//Size is 6
        System.out.println(set.contains(50));//true
        //remove() : TC = O(1)
        set.remove(100);
        System.out.println(set.size());//5
        set.remove(2);//Even if 2 does not exits, It gives No error
        //toArray
          Integer[] arr = set.toArray(new Integer[set.size()]);
//        Object[] arr = set.toArray();//class [Ljava.lang.Object;
//        Object[] arr = set.toArray(new Object[set.size()]);//class [Ljava.lang.Object;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");//50 20 -8 -200 10
        }
        System.out.println();
        System.out.println(arr.getClass());//class [Ljava.lang.Integer;

    }
}
