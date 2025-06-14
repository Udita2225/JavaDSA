package HashSetAndHashMap;
/*In HashMap:
Keys must be unique.
→ If you insert a key that already exists, the old value is overwritten with the new value.
Values can be duplicate or same.
→ Multiple keys can have the same value.
*/
import java.util.HashMap;

public class MapBasic {
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();
       map.put("Udita",11);
       map.put("Raghav",76);
       map.put("Ruhi", 13);
       map.put("Prachi", 88);
       map.put("Radhika", 98);
         System.out.println(map.size());//5
         System.out.println(map);//{Raghav=76, Prachi=88, Ruhi=13, Udita=11, Radhika=98} Key = Value
         System.out.println(map.size());//5
         System.out.println(map.containsKey("Ruhi"));//true
         System.out.println(map.containsKey("Kavita"));//false
         System.out.println(map.containsValue(88));//true
         System.out.println(map.containsValue(13));//true
         System.out.println(map.containsValue(99));//false
       map.put("Raghav", 77);
         System.out.println(map.size());//5
         System.out.println(map); //{Raghav=77, Prachi=88, Ruhi=13, Udita=11, Radhika=98}
       map.put("Madhav", 90);
         System.out.println(map);//{Raghav=77, Prachi=88, Ruhi=13, Madhav=90, Udita=11, Radhika=98}
       map.put("Harish",77);
         System.out.println(map);//{Raghav=77, Prachi=88, Ruhi=13, Madhav=90, Udita=11, Radhika=98, Harish=77
         System.out.println(map.size());//7

        map.remove("Raghav");
         System.out.println((map+" "+map.size()));//{Prachi=88, Ruhi=13, Madhav=90, Udita=11, Radhika=98, Harish=77} 6
        map.remove("Manohar");//Even though Manohar Does not Exist, But still there will be no error
         System.out.println(map+ " "+ map.size());//{Prachi=88, Ruhi=13, Madhav=90, Udita=11, Radhika=98, Harish=77} 6
       //map.get(key) Gives The value of that key
        System.out.println(map.get("Udita"));//11
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
    }
}
