package MultiDimensionalArrayAndArrayList;

public class ForEach {
    public static void main(String[] args) {
        int[] a = {4,7,2,8};
        for(int ele: a){
            System.out.print(ele+ " ");
        }
        System.out.println();
      //We can't modify the elements of Array Using for-each loop
        //It is just useful in printing of each element
        int[][] b = {{1,2,3}, {4,5,6}}; //No.OF elements in b =2
        for(int[] ele : b){
            //System.out.print(ele);
            //This is not going to print the complete elements of b as b is an array of arrays;
            //In order to print each element of b we will have to use one more for-each loop
        for(int x: ele){
            System.out.print(x + " ");
        }

        }
    }
}
