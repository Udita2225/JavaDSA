package MultiDimensionalArrayAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LEETCODEProblem118PascalTriangle {
    public static void main(String[] args) {
        //Given an integer 'n', generate Pascal's Triangle
        /*                            0 1 2 3 4 5
                  1               0   1            //This is a 2-D ArrayList
                 1  1             1   1 1            for n =6(Row Number)
                1  2  1           2   1 2 1          We have to return a 2-D ArrayList
               1  3  3  1         3   1 3 3 1
              1  4  6  4  1       4   1 4 6 4 1
             1  5  10 10  5 1     5   1 5 10 10 5 1
             //Yaha par hum sbse pehle 1 daalenge arrayList me
             l.get(2).get(1) = l.get(1).get(1) + l.get(1)(0)
             l.get(i).get(j) = l.get(i-1).get(j) + l.get(i-1).get(j-1)
             List<List<Integer> l =
             Values Update set se hoti hain naa ki get se
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();
//       List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0; i<n; i++){
//            List<Integer> l= new ArrayList<>();
//            for(int j = 0; j<=i; j++){
//                l.add(1);
//            }
//            ans.add(l);
//        }
//        for(int i =2; i<n; i++){
//            for(int j=1; j <=i-1; j++ ){
//                ans.get(i).set(j, ans.get(i-1).get(j)+ ans.get(i-1).get(j-1));
//            }
//        }
//        System.out.println(ans+ " ");


        //Optimized code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    l.add(1);
                }
                else{
                    l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }
        System.out.println(ans);
    }
}
