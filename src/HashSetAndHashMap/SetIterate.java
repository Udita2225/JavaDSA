package HashSetAndHashMap;

import java.util.HashSet;

public class SetIterate {
    public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    int[] arr = {4,9,2,6,4,8,1};
    for(int ele: arr){
        System.out.print(ele +  " ");//4 9 2 6 4 8 1
    }
    System.out.println();
    set.add(20);
    set.add(100);
    set.add(10);
    set.add(-8);
    set.add(200);
    for(int ele: set){
        System.out.print(ele+" ");//20 100 -8 200 10
//        Printed In Random Order
    }
    System.out.println();
//    We cannot add/remove any element while iterating the set
//    set.clear(); - It clears/empties the whole set
//    set.clear();
//    System.out.println(set);//[]
//    In HashSet, The occurence of each element is 1
    set.add(13);
    System.out.println(set);//[20, 100, -8, 200, 10, 13]
    set.add(20);
    System.out.println(set);//[20, 100, -8, 200, 10, 13]
    }
}
