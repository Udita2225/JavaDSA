package Strings;
// == Vs equals()
// != Vs !equals()
public class equalsVsDoubleEqualToInJava {
    public static void main(String[] args) {
    String s = "abcxyz";
    String t = "abcxyz";
    //Memory ke andar ek hi baar abcxyz bana hai
    // 's' bhi usi ko point kar raha hai aur 't' bhi
    System.out.println(s==t);
    //yaha par '==' bs ye show kar raha hai ki dono same memory address par located hai
    // '==' Internally char by char check anhi karta hi dono equal hai ya nahi
    //This is the Concept Of Interning

    String a = "abcxyz";
    String b = "abc";
        System.out.println(a==b);//false
    b += "xyz";
        System.out.println(a);//abcxyz
        System.out.println(b);//abcxyz
        System.out.println(a==b);//false
        //Because '==' memory address ko dekh rha hai naa ki internal characters ko
    //Final Comaparison
        String x ="abcxyz";
        String y ="abcxyz";
        String z = new String(x);
        String c = "abc";
        c = c + "xyz";
        System.out.println(x==y);//true
        System.out.println(x==z);//false
        System.out.println(x==c);//false
        //equals():- Compares character By character

        System.out.println(x.equals(y));//true
        System.out.println(x.equals(z));//true
        System.out.println(x.equals(c));//true

        //compareTo()
        System.out.println(x.compareTo(y));//0
        System.out.println(x.compareTo(z));//0
        System.out.println(x.compareTo(c));//0
    }
}
