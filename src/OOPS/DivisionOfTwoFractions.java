package OOPS;

public class DivisionOfTwoFractions {
    public static DivFraction div(DivFraction f1, DivFraction f2){
        int numerator = f1.num*f2.den;
        int denominator = f1.den*f2.num;
        DivFraction f3 = new DivFraction(numerator,denominator);
        return f3;
    }
    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i = min; i>=1; i--){
            if(num%i==0 && den%i==0){
                return i ;
            }
        }
        return 1;
    }
    public static class DivFraction{
        int num;
        int den;
        public DivFraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }

    }
    public static void main(String[] args) {
        DivFraction f1 =new DivFraction(35,21);
        System.out.println(f1.num + "/" + f1.den);
        DivFraction f2 =new DivFraction(7,3);
        System.out.println(f2.num + "/" + f2.den);
        DivFraction f3 = div(f1,f2);
        System.out.println(f3.num + "/"+ f3.den);
    }
}
