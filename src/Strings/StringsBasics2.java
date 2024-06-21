package Strings;
import java.util.*; //* includes everything
import java.util.Scanner;

//String str = "Hello";
//next() = Takes input only till space . When the space is encountered, it does not read the remaining string
//nextLine() = Takes the whole string as input
public class StringsBasics2 {
    public static void main(String[] args) {
        //Taking Input
        Scanner sc = new Scanner(System.in);
        //Method 1
        //String s =sc.next(); //sc.next() jaise hi space dekhta hai to uske aage ki cheeze read nahi karta hai
        //Method 2
        String l = sc.nextLine(); //sc.nextLine(); Ye space ke aage ki cheeze bhi read karta hai
        //System.out.println(s);
        System.out.println(l);
//        String str = "College Wallah";
//        System.out.println(str);


//IMPORTANT FUNCTIONS IN STRINGS
/*
1. charAt() = Unlike Arrays, we can't use arr[index number] to get elements in Strings
              For this, we use char ch = string_name.charAt(Index_Number);
              It gives the character at particular index
              eg = char ch = str.charAt(3);

2. length() = It gives the length of string .In Arrays we were using arr.length; without any bracket
              But in strings we will use brackets variablename.length();
              It counts the space as space is also a character

3. indexOf()= String str = "Raghav"
              int idx = str.indexOf('a'); As there are two 'a' in the string. It will give the index of first Occurance i.e 1
              It gives the index of particular character.

4. compareTo() = Diverse Function
              It is used to compare two strings. If two strings are exactly same then it gives 0
              If one string is greater than the other lexographically then it givs a positive number
              If one string is smaller than the other lexographically the it gives a negative Number
              eg:-
              string1 = str         string2 =gtr  Output   Particular Values that will come
              abc           =       abc           0        0
              bbc           >       abc           +ve      1 (It means difference between the ascii value of b and a is 1)
              abd           >       abc           +ve      1 (Diff between d and c is also 1)
              abc           <       zbc           -ve      -25 (Difference between a and z is -25)
              Lexographic - It means that if any character of 1st String has ASCII value greater than the corresponding ASCII value of the character of other String. It will give +ve Value
              str.compareTo(gtr);
5. contains() = It gives the Boolean Value. If a particular string is present in the given String .Then it gives the value True else False
                Order of required string must be same in the given String
                We cannot find a particular Character in the given String . It will give error.
                Only String can be found..
                Basically String is written in double inverted commas while Character is written in single Inverted Commas
6. endsWith() = It also the Boolean Value That whether a Given String ends with a particular string or not.
7. startsWith() = It gives the Boolean Value That whether a given string starts with a particular String or not.
8. toLowerCase()= It converts the whole string into LOwerCase
                  str = Physics Wallah
                  System.out.print(str.toLowerCase()) //Bracket ke andar kuchh nahi likhna hota hai
                  physic swallah
9. toUpperCase()= It converts the whole string into UpperCase.
                  string.toUpperCase()
                  PHYSICS WALLAH
10. concat() = concat is used to combine two strings (Concatinat)
               s1.concat(s2); s1 ke aage s2 lag jaata hai
11. substring(i,j) & substring(i) =MOST IMPORTANT Explained in a new package


 */     //length();
        String udita= "HELLO How ARE YOU";
        int len = udita.length();
        System.out.println(len);
        System.out.println(udita.length());
        //charAt();
        String Name = "Abhinav";
        char ch = Name.charAt(4);
        System.out.println(ch);
        System.out.println(Name.charAt(5));
        //indexOf();
        System.out.println(Name.indexOf('a'));
        //compareTo();
        String str =  "abc";
        String gtr =  "zbc";
        System.out.println(str.compareTo(gtr));
        //contains(str)
        String name = "Physics Wallah";
        System.out.println(name.contains("Wal"));//true
        System.out.println(name.contains("P"));//Here if "P" is written as 'P' then it will give error
        System.out.println(name.contains("xyzos"));//False
        System.out.println(name.contains("ysi"));//True
        //endsWith(str)
        System.out.println(name.endsWith("lah"));
        System.out.println(name.endsWith("xys"));
        //startsWith(str)
        System.out.println(name.startsWith("Phy"));
        System.out.println(name.startsWith("xys"));
        //toLowerCase()
        System.out.println(name.toLowerCase());
        //toUpperCase()
        System.out.println(name.toUpperCase());
        //concat()
        String s1 = "abc";
        String s2 = "bcd";
        String s3 = s1.concat(s2); //Ek nayi string ban rahi hai jisme s1 aur s2 ka mixture aa raha hai
        System.out.println(s3);
        System.out.println(s1.concat(s2));



    }
}
