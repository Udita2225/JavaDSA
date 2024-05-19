package LOOPS;
import java.util.Scanner;
public class GPWithoutUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        //GP - 1, 2, 4,8,16,32; upto n terms
        //Common Ratio =r;
//        int a=1;
//        for(int i =1; i<=n ; i++){//shortcut = fori> enter
//            System.out.println(a);
//            a*=2;
//        }
        //GP- 3, 12, 48 ...
        int a =3;
        for(int i =1; i<=n; i++){
            System.out.println(a);
            a*=4;
        }

    }
}
