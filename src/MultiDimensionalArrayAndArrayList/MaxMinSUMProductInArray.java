package MultiDimensionalArrayAndArrayList;

public class MaxMinSUMProductInArray {
    public static void main(String[] args) {
        int[][] arr ={{1,5,6}, {2,-9, 30}, {5,10,3}};
        int mx =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0;
        int product = 1;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                mx =Math.max(mx, arr[i][j]);
                min =Math.min(min, arr[i][j]);
                sum+= arr[i][j];
                product*= arr[i][j];
            }
        }
        System.out.println(mx);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(mx+ " "+ min+ " "+ sum + " " + product);
    }
}
