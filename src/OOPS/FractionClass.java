package OOPS;

import java.sql.SQLOutput;
public class FractionClass {
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
        }
       }
       public static void main(String[] args) {
        Fraction f1 = new Fraction(7,21);
        System.out.println(f1.num + "/" + f1.den);
        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num + "/" + f2.den);
    }
}
