package Arrays;

public class SortZeroOneTWO {
    public static void main(String[] args) {
//Method 1;
        int[] arr ={ 0,1,2,2,1,2,1,2,0,0};
        int n = arr.length;
        int noz =0, noo=0; //noz = no. of zeros, noo= no.of ones;
        for(int i =0; i<n; i++){
            if(arr[i]==0) noz++;
            if(arr[i]==1) noo++;
        }
        for(int i =0; i<n; i++){
            if(i<noz) arr[i]=0;
            else if(i<noz+noo) arr[i]=1;
            else arr[i] =2;
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    //Method 2 DUTCH FLAG ALGORITHM
    }
}
