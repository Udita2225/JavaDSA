package HashSetAndHashMap;
/*
TreeSet/TreeMap :- Ordered Set/Ordered Map T.C O(logn)
HashMap/HashSet:- Unordered Set/Unordered Map T.C O(1)
*/
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetAndTreeMaps {
    public static void main(String[] args) {
        //TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for (int ele : set) {
            System.out.print(ele + " ");
        }
        System.out.println();//-8 10 20 100 200  Sorted Order
        //TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Raghav", 76);
        map.put("Himanshu", 83);
        map.put("Sunil", 2);
        map.put("Amritanshu", 13);
        map.put("Ayushi",82);
        map.put("Prachi", 88);
        for(String key : map.keySet()){
            System.out.println(key +" "+ map.get(key));
        }
        /*Sorted Order on the basis of Key Value
        Amritanshu 13
        Ayushi 82
        Himanshu 83
        Prachi 88
        Raghav 76
        Sunil 2
        */
    }
}