package HashSetAndHashMap;

import java.util.HashMap;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Himanshu", 83);
        map.put("Amrit", 13);
        map.put("Ayushi", 82);
        map.put("Prachi", 88);
        System.out.println(map);//This is not Iteration
        //{Raghav=76, Prachi=88, Amrit=13, Himanshu=83, Ayushi=82}
        for(String key: map.keySet()) {
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        /*
        Raghav 76
        Prachi 88
        Amrit 13
        Himanshu 83
        Ayushi 82
        */
        System.out.println();
        for(int val: map.values()){
            System.out.println(val);//It prints all the values even they are repeating
        }
        /*
        76
        88
        13
        83
        82
        */

        //Entry Set- returns a set of key-value pairs
        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }
        /*
        Raghav=76
        Prachi=88
        Amrit=13
        Himanshu=83
        Ayushi=82
         */
    }
}