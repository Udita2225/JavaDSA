package Strings;

public class StringEqualsVsComparisonOperator {
    public static void main(String[] args) {
        /*Comparison Relational Operator ==
        This is used for comparing integers/Doubles/Characters But Never use it for comparing Strings
       */
        String s1 ="Hello"; //s1 and s2 pointing to same address
        String s2 ="Hello";
        String s3 =new String("Hello"); //Different Address
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1==s3);
        //(s1==s2) True
        //(s1==s3) False
        /*
        Technically teeno strings to same hi hain But when we use == operator then it shows s1=s2 but s1=s2!=s3
        Because == Operator checks the address of particular int/char/string/Double
        Since while using new keyword, s3 forms at the new address Thus it shows that s1=s2!=s3
        In order to avoid this we only use string.equals() operator for comparing two strings
        string.equals()
        It first checks the address of the string . If the address is not same then it checks each and every Character
        individually.
         */
    }
}
