package CompositePatterens.java;

import java.util.Scanner;

public class NumberSpiral {
    /*
     4 4 4 4 4 4 4              2 2 2                1 1 1 1 1 1 1
     4 3 3 3 3 3 4              2 1 2   for n=2      1 2 2 2 2 2 1
     4 3 2 2 2 3 4   for n=4    2 2 2                1 2 3 3 3 2 1
     4 3 2 1 2 3 4                                   1 2 3 4 3 2 1  Pehle humne ye print kiya hai
     4 3 2 2 2 3 4                                   1 2 3 3 3 2 1  uske baad k ek integer lekar
     4 3 3 3 3 3 4                                   1 2 2 2 2 2 1  corresponding digits ka sum 5 aa raha hai
     4 4 4 4 4 4 4                                   1 1 1 1 1 1 1  so taking k as an integer
                                                                    k=n+1-min(a,b)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a = i, b=j;//pseudo numbers
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(n+1-Math.min(a,b)+ " ");//Minimum of two numbers
            }
            System.out.println();
        }


    }
}