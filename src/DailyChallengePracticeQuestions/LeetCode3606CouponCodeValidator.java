package DailyChallengePracticeQuestions;
/*
3606. Coupon Code Validator
You are given three arrays of length n that describe the properties of n coupons: code, businessLine, and isActive. The ith coupon has:

code[i]: a string representing the coupon identifier.
businessLine[i]: a string denoting the business category of the coupon.
isActive[i]: a boolean indicating whether the coupon is currently active.
A coupon is considered valid if all of the following conditions hold:

code[i] is non-empty and consists only of alphanumeric characters (a-z, A-Z, 0-9) and underscores (_).
businessLine[i] is one of the following four categories: "electronics", "grocery", "pharmacy", "restaurant".
isActive[i] is true.
Return an array of the codes of all valid coupons, sorted first by their businessLine in the order: "electronics", "grocery", "pharmacy", "restaurant", and then by code in lexicographical (ascending) order within each category.



Example 1:

Input: code = ["SAVE20","","PHARMA5","SAVE@20"], businessLine = ["restaurant","grocery","pharmacy","restaurant"], isActive = [true,true,true,true]

Output: ["PHARMA5","SAVE20"]

Explanation:

First coupon is valid.
Second coupon has empty code (invalid).
Third coupon is valid.
Fourth coupon has special character @ (invalid).
Example 2:

Input: code = ["GROCERY15","ELECTRONICS_50","DISCOUNT10"], businessLine = ["grocery","electronics","invalid"], isActive = [false,true,true]

Output: ["ELECTRONICS_50"]

Explanation:

First coupon is inactive (invalid).
Second coupon is valid.
Third coupon has invalid business line (invalid).


Constraints:

n == code.length == businessLine.length == isActive.length
1 <= n <= 100
0 <= code[i].length, businessLine[i].length <= 100
code[i] and businessLine[i] consist of printable ASCII characters.
isActive[i] is either true or false.
*/
public class LeetCode3606CouponCodeValidator {
    /*
    class Solution {
    public class Pair{
        String business;
        String code;
        public Pair(String business, String code){
            this.business =  business;
            this.code = code;
        }
    }
    public boolean ifCode(String code){
        if(code.isEmpty()) return false;
        for(int i=0; i<code.length(); i++){
            int ascii = (int)code.charAt(i);
            if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57) || (ascii==95))) return false;
        }
        return true;
    }
    public boolean ifBusinessLine(String business){
        String a = "electronics";
        String b = "grocery";
        String c = "pharmacy";
        String d = "restaurant";
        if(business.equals(a)|| business.equals(b) || business.equals(c) || business.equals(d)) return true;
        else return false;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        List<Pair> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ifCode(code[i]) && ifBusinessLine(businessLine[i]) && isActive[i]) {
                ans.add(new Pair(businessLine[i],code[i]));
            }
        }
        Collections.sort(ans,(a,b)->{
            int cmp = a.business.compareTo(b.business);
            if(cmp!=0) return cmp;
            return a.code.compareTo(b.code);
        });
        List<String> str = new ArrayList<>();
        for(Pair p: ans){
            str.add(p.code);
        }
        return str;
    }
}
    */
}
