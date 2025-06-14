package HashSetAndHashMap;

public class LeetCode242ValidAnagramOptimizedCode {
/*
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    HashMap<Character,Integer> sMap =  new HashMap<>();
    HashMap<Character,Integer> tMap =  new HashMap<>();
    for(int i=0; i<s.length(); i++){
        char key = s.charAt(i);
        if(sMap.containsKey(key)){
            int freq = sMap.get(key);
            sMap.put(key,freq+1);
        }
        else sMap.put(key,1);
    }
    for(int j=0; j<t.length(); j++){
        char key = t.charAt(j);
        if(tMap.containsKey(key)){
            int freq = tMap.get(key);
            tMap.put(key,freq+1);
        }
        else tMap.put(key,1);
    }
    // for(int i=0; i<s.length(); i++){
    //     char key = s.charAt(i);
    //     if(sMap.get(key)!=tMap.get(key)) return false;
    // }This sometimes can give an error So try traversing in one of the Map
    for(char key : sMap.keySet()){
        // int val1 = sMap.get(key);
        if(!tMap.containsKey(key)) return false;
        // int val2 = tMap.get(key);
        // if(val1 != val2) return false;
        if(!sMap.get(key).equals(tMap.get(key))) return false;
    }
    return true;
    }
}
*/
}
