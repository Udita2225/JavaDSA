package StringBuilderClass;
import java.util.*;
public class ImportantFunctionsOfStringBuilder {
    //The main use of StringBuilder is that we had charAt function in Strings But Didn't have SetChar FUNCTION
    //But in StringBuilder , we do have SetChar Function which is used to avoid Immutability
    public static void main(String[] args) {
        /*
        1. StringBuilderName.append() - It is used to add a String/Character/Integer to a StringBuilder at the last
        2. setCharAt(idx, ch)         - It is used to modify a particular Character of a String into another String/Character/Integer
        3. insert(idx, ch)            - It is usd to insert a char/integer/String in between the String
           eg - str.insert(2,'y')     - This will insert y in the string at the index 2 and shift the remaining Characters towards right
        4. deleteCharAt(idx)          - This will delete the character at particular Index
        5. reverse()                  - It is used to reverse the entire String
        6. delete(i,j)                - It is used to delete a range of characters in a String from index i to index j
        7. indexOf()
        8. str.substring()
        */
       //append()
        StringBuilder str  =new StringBuilder("Hello");
        str.append(10);
        str.append(" World");
        System.out.println(str);//Hello10 World
        //setCharAt(index, ch)
        str.setCharAt(0,'M');
        str.setCharAt(2,'w');
        System.out.println(str);//Mewlo10 World
        //str.insert(index, ch)
        str.insert(7, 2);//Mewlo102 World
        str.insert(10, 'k');//Mewlo102 Wkorld
        System.out.println(str); //Mewlo102 Wkorld
        //deleteCharAt(index)
        str.deleteCharAt(0);
        System.out.println(str);//ewlo102 Wkorld
        //reverse
        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb); //scisyhP
        //delete(i, j)
        sb.reverse();
        System.out.println(sb);//Physics
        sb.delete(2,4); //2 to 3 delete hoga Basically deletion will occur from index i to j-1
        System.out.println(sb); //Phics
        //sb.substring()
        String k = sb.substring(3);//substring ko hume kisi aur string variable me store karne ki need hoti hai
        System.out.println(k); //cs
    }
}
