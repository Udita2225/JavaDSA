package JavaInput;

public class HierarchyOfOperators {
    public static void main(String[] args) {
        //hierarchy BODMAS (Maths) Brackets Order Division Multiplication ADD Subtraction
        /*MATHEMATICS-
        1.Brackets
        2.Order(power)
        3.Divison/Multiplication
        4.Addition/Subtraction
         */
        /*COMPUTER
       1. separate sections of addition  & sub..
        Maths-2*3/4 = 6/4=1.5,    2*3/4 =2*0.75=1.5 (same answers)
        Comp- 2*3/4= 6/4= 1,      2*3/4 =2*0=0      (different answers)[in double there is no problem
                (right ans.)                                           but in int there are diff answers.]

       2.  ****IN COMPUTERS OPERATIONS OPERATE FROM (LEFT TO RIGHT )
         */
        //Predicting the output
        int i=2, j=3, k ,l;
        double a,b;
        k=i/j*j;
        l=j/i*i;
        a=i/j*j;
        b=j/i*i;
        System.out.println(k+" "+l+" "+a+" "+b);
    }
}
