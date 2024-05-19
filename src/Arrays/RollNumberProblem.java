package Arrays;

public class RollNumberProblem {
    //Given an array of marks of Students, if the mark of any student is less than 35 . Print its roll number.[Roll Number here
    //refers to the index of the array.
    public static void main(String[] args) {

        //int [] arr; DECLARATION
        // arr = new int[n]; MEMORY ALLOCATION
        int[] arr = {81, 45, 67, 100, 12, 34, 56, 24};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) {
                System.out.println(i + " ");
            }
        }
    }
}
/*
Are the following array declarations correct?
int a(25);    FALSE int[] a;  No round  bracket
int size = 10, b[size];  FALSE in JAVA
//int size =10; int b[size];Correct Initialisation in C/C++
int c ={0,1,2}; FALSE  int[] c ={0,1,2}
*/
/*
num[4]= 5th element from the start; num = array name
 */
