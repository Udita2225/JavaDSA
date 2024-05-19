package MultiDimensionalArrayAndArrayList;

public class PrintingMatrixInSpiralForm {

        public static void print(int[][] arr){
            int m = arr.length;
            int n = arr[0].length;
            for (int i = 0; i <m ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } //We have hidden the formed function in order to save space by using the arrow on the left side
        public static void main(String[] args) {
            int[][] arr = {{1,2,3,4,5}, {6,7, 8 ,9,10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20 },{21, 22, 23, 24, 25},{26, 27, 28, 29, 30}};
            print(arr); //Calling the print function
            int  m = arr.length;
            int n= arr[0].length;
            //Spiral Print
            int minr =0, maxr = m-1, minc=0, maxc = n-1;
            /*
            We have to move  1. Left  to Right
            2. Top to Bottom
            3. Right to Left
            4. Bottom to Top
             */


            while(minr<=maxr && minc<=maxc){
                //Left to Right
                for(int j=minc; j<=maxc; j++){
                    System.out.print(arr[minr][j]+" ");
                }minr++;
                System.out.println();
                //Top to Bottom
                if(minr>maxr || minc>maxc) break;
                for(int i =minr; i<= maxr; i++){
                    System.out.print(arr[i][maxc]+ " ");
                }maxc--;
                System.out.println();
                //Right to Left
                if(minr>maxr || minc>maxc) break;
                for(int j = maxc; j>=minc; j--){
                    System.out.print(arr[maxr][j]+ " ");
                }maxr--;
                System.out.println();
                //Bottom To Top
                if(minr>maxr || minc>maxc) break;
                for(int i =maxr; i>=minr; i--){
                    System.out.print(arr[i][minc] + " ");
                }minc++;
                System.out.println();

            }




    }
}
