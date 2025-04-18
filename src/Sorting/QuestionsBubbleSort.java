package Sorting;

public class QuestionsBubbleSort {
    public static void main(String[] args) {
        //Sort a given Array In Decreasing Order Using Bubble Sort
        //After every pass the smallest element will be at last
        //After every pass every kth smallest element will  be at the right place.
      int[] arr = {3,1,2,5,4};
      int n = arr.length;
      for(int i = 0; i<n-1; i++){
          boolean flag = true;
          for(int j =0; j<n-1-i; j++){
              if(arr[j]<arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] =temp;
                  flag = false;
              }
          }
          if(flag==true) break;
      }
      for(int ele: arr){
          System.out.print(ele + " ");
      }
        System.out.println();
    }
}
