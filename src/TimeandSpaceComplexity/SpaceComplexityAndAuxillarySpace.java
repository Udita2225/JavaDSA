package TimeandSpaceComplexity;

public class SpaceComplexityAndAuxillarySpace {
    public static void main(String[] args) {
        /*
        O(n) = Big Oh Notation
        //SPACE COMPLEXITY  AND AUXILLARY SPACE
        Space Complexity - Total space used  [in terms of n(approximated)]
        Auxillary Space -  Extra Space used by our Algorithm
        Given array space is not counted in Auxillary Space
        Kisi bhi Question ko solve karne ke liye jo hum extra array banaye to wo jo space cover karega wo auxillary soace me aayega
        //CONSTANT SIZE COMPLEXITY
        Jab kabhi bhi hum constant size ka array banaye ya sirf ek integer/double/float in sabko bas declare aur initialize kiya ho tab hamari
        Space Complexity  - Big Oh Of 1 = O(1)
*/
        /*
        Ques - Calculate the time ans space Complexity for the below code snippet
        int[] a =new int[n];
        for(int i=0; i<n; i++){
        a[i]++;
        }
        Ans - Total Number Of Operations = n
              Time Complexity = O(n)
              Space Complexity = O(n)
              Auxillary Space will be nothing.
              */
        /*
        Ques- What will be the space Complexity if we just traverse without creating any array?
        int c =0;
        for(int i =0; i<n; i++){
        c++;}
         Time Complexity = O(n)
         Space Complexity = 0(1)
         */
        /*
        Ques:-
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i =0; i<n; i++){                   Time =n
        a.add(1);                                  Space=n
        }
        for(int i =0; i<m; i++){
        b.add(1);
        }
            0 1 2 3 4.......n-1
        a = 1,1,1,1,1.......1

            0 1 2 3 4.......m-1
        b = 1,1,1,1,1.......1
        Time Complexity = O(n+m)
        Space Complexity = O(n+m)
         */

    }
}
