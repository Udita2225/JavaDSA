package TimeandSpaceComplexity;

public class SpaceComplexityOfCreating2DMatrix {
    public static void main(String[] args) {
        /* For 2-D, We have Quadratic Space Complexity
        int[][] a = new int[n][m];
        Total elements =n*m;
        Space Complexity = O(n*m); **Quadratic Space Complexity
        */
        /* Ques- What will be the space Complexity if we create 3 Arrays of the same size?
                 int[] a =new int[n];
                 int[] b =new int[n];     Space Used = n+n+n =3n
                 int[] c =new int[n];
                 for(int i=0; i<n; i++){
                 c[i]++;
                 }
           Ans - Time Complexity = O(n);
                 Space Complexity = O(3n)~ O(n)
*/
    }
}
