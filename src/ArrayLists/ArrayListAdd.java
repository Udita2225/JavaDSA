package ArrayLists;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();//Not taking Initial Capacity
        System.out.println(List);
        System.out.println(List+ " " + List.size());
        List.add(60);
        System.out.println(List+ " " + List.size());
        List.add(20);
        System.out.println(List+ " " + List.size());
        List.add(78);
        System.out.println(List+ " "+ List.size());
        //Removing element from ArrayList;
        List.remove(1);
        System.out.println(List+ " " + List.size());



    }
}
