package Strings;

public class ImmutabilityOfStrings {
    public static void main(String[] args) {
        //IMMUTABILITY OF STRINGS - It is present due to the existence of Interning & Security reasons
        /*
        We can't change individual characters of Strings
        If we do, then we will waste a lot of space.
        String str ="Hello";
        str.charAT(0) = 'D' XXXX THis is wrong This will not Give "Dello" This will give an error
        Although ese changes character array me easily ho skte hain, Updation , Deletion , Modification array me to ho skta hai but
        Strings me nahi
        This can be done by :-
        str = "Dello"; Now s will point to Dello (Hello is still existing in the memory"
      */
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        //Making 2nd Character - 'y';
        s = s.substring(0,2) + 'y'+s.substring(3);//Yaha par koi bhi character change nahi ho raha hai balki ek nayi string form ho rahi hai
        //This is not an effective method
        //It can change the reference but not the exact string
        //This happens because of security reasons.
        System.out.println(s);
    }
}
