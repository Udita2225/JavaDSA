package HashSetAndHashMap;
import java.util.HashSet;
public class AddSameInSet {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        Duplicacy is Not Allowed in HashSet
//        Chahe Kitne Baar Bhi Add karlo same element, wo sirf ek baar hi add Hoga
        HashSet<String> set =  new HashSet<>();
        set.add("Udita");
        set.add("Udita");
        set.add("Udita");
        set.add("Udita");
        System.out.println(set);//[Udita]
        System.out.println(set.size());//1
        set.remove("Udita");
        System.out.println(set +" "+ set.size());//[] 0
    }
}
