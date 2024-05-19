package Arrays;

public class QuestionsInArraysTwoSum {
    //Ques. Find the doublet in the array whose Sum is equal to the given value x.
    public static void main(String[] args) {
        int[] arr ={5, 2, 7, -1, 7,6,9};
        int x =9;
        for(int i =0; i<arr.length; i++){
            boolean flag =false;//optimisation
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+ arr[j]==9){
                    System.out.println(arr[i]+ " "+ arr[j]);
                    flag = true;//optimization
                    break;
                }
            }
            if(flag == true) break;//optimization
        }
    }
}
