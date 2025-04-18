package OOPS;

public class MultiplyOfTwoFractions {
    //Multiplication of two fractions and storing it in a fraction

        public static Fraction multiply(Fraction f1,Fraction f2 ){//Because hum fraction return karke fraction me hi store kar rahe hain
            //So hamara return type bhi Fraction hi hoga
            int numerator = f1.num*f2.num;
            int denominator = f1.den*f2.den;
            Fraction f3 =new Fraction(numerator,denominator);
            return f3;
        }
        public static  int gcd (int num, int den){
            int min = Math.min(num,den);
            for(int i =min; i>=1; i--){
                if(num%i==0 && den%i==0){
                    return i;
                }
            }
            return 1;
        }
        public static class Fraction{
            int num;
            int den;
            public Fraction(int num, int den){//Constructor
                this.num = num;
                this.den = den;
                simplify();
            }
            public void simplify(){
                int hcf = gcd(num,den);
                num /= hcf;
                den /= hcf;
            }
        }
        public static void main(String[] args) {
            Fraction f1 = new Fraction(35, 21);
            System.out.println(f1.num+"/"+f1.den);
            Fraction f2 = new Fraction(7, 3);
            System.out.println(f2.num+"/"+f2.den);
            Fraction f3 = multiply(f1, f2);
            System.out.println(f3.num+ "/" + f3.den);
            //Output
        /*
        5/3
        7/3
        4/1
        */

        }

    }
