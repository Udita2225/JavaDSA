package Recursion;
import java.util.*;
public class AddingSubsetsToArrayList {
    static ArrayList<String> arr = new ArrayList<>();//Global

    public static void printSubsets(int i, String s, String ans) {
        if (i == s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i + 1, s, ans);//not take
        //ans+=ch;
        //printSubsets(i+1,s,ans);
        printSubsets(i + 1, s, ans + ch);//take
    }

    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>(); //Reset  Reset is very important for checking number of test cases in LeetCode
        printSubsets(0, s, "");
        System.out.println(arr);
    }
}
//Output
// [, c, b, bc, a, ac, ab, abc]