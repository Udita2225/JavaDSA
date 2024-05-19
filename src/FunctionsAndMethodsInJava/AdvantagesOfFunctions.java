package FunctionsAndMethodsInJava;

public class AdvantagesOfFunctions {
    /*
    2 Major Advantages Of Functions:-
    * Code Modularity
    * Reusability
    * Reduces Redundancy
    * Easy to understand, manage and debug.
    1. MODULARITY

     Unstructured Style                                        Structured STYLE
    #include<stdio.h>                                       #include<stdio.h>
    void main(){                                            int add(int x, int y)
    int a, b;                                               {
    int sum, diff;                                            int res=x+y;
    printf("Enter the two numbers to add:\n");                return res;
    scanf("%d %d ", &a, &b);                                 }
    sum = a+b;                                              int sub(int x, int y)
    printf("The sum is %d", sum);                           {
    printf("Enter the two numbers to subtract:\n");           int res= x-y;
    scanf("%d %d", &a, &b);                                   return res;
    diff - a-b;                                              }
    printf("The difference is: %d", diff);                   void main(){
    }                                                          int a, b;
                                                               int sum, diff;
    3 Tasks Found:-                                            printf("Enter the two numbersto add: \n");
    1. ADDITION -   add();                                     scanf("%d %d", &a, &b);
    2. SUBTRACTION- sub();                                     sum = add(a,b);
    3. EXECUTION -  main();                                    printf("The sum is: %d" , sum);
                                                               printf("Enter the two numbers to subtract: \n");
                                                               scanf(%d %d", &a, &b);
                                                               diff = sub(a,b);
                                                               printf("The difference is : %d", diff);



OUTPUT:-
Enter the two numbers to add:-
10
20
The sum is: 30
Enter the two numbers to subtract:
40
15
The difference is: 25

2.REUSABILITY
LOOPS - If the task gonna be repeated multiple times at the same place , go with loops
FUNCTIONS:- If the task gonna be repeted multiple times at different places , go with Functions
//How to check  a number is vowel or Consonant:-
#include<stdio.h>
void checkAlphabet(char ch){

switch(ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u': printf("Vowel");
break;
default: printf("Consonant");}
}
void main()
{
checkAlphabet('i');

}





   */
}
