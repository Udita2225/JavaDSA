package Heaps1;

public class SelectionSortAlgoPractice {
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, 8};
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
        Min =  Math.min(Min,arr[i]);
        }
        System.out.println(Min);
        //SelectionSort
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIdx]) minIdx = j;
            }
            //swap arr[i] and arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}