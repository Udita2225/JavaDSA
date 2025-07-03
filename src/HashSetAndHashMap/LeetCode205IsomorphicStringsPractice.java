package HashSetAndHashMap;

public class LeetCode205IsomorphicStringsPractice {
/*
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            char[] a = new char[128];
            for(int i=0; i<s.length(); i++){
                char ch =  s.charAt(i);
                char dh =  t.charAt(i);
                int idx = (int)ch;
                if(a[idx] == '\0') a[idx]=dh;
                else if(a[idx]!=dh) return false;
            }
            char[] b = new char[128];
            for(int i=0; i<t.length(); i++){
                char ch =  t.charAt(i);
                char dh =  s.charAt(i);
                int idx = (int)ch;
                if(b[idx] == '\0') b[idx]=dh;
                else if(b[idx]!=dh) return false;
            }
            // We can use the same Array by setting all its values as '0'
            // for(int i=0; i<a.length; i++){
            //     a[i] = '\0';
            // }
            // for(int i=0; i<t.length(); i++){
            //     char ch =  t.charAt(i);
            //     char dh =  s.charAt(i);
            //     int idx = (int)ch;
            //     if(a[idx] == '\0') a[idx]=dh;
            //     else if(a[idx]!=dh) return false;
            // }

            return true;
        }
    }
/* Using Map Method
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key =  s.charAt(i);
            char pair = t.charAt(i);
            if(map1.containsKey(key)){
                char comp =  map1.get(key);
                if(comp!=pair) return false;
            }
            else map1.put(key,pair);
            if(map2.containsKey(pair)){
                char comp = map2.get(pair);
                if(comp!=key) return false;
            }
            else map2.put(pair,key);
        }
        return true;
    }
}
*/
}

