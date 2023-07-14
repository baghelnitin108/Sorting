package Shorting;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[]arr={7,9,2,0,1};

        for(int i=0;i<arr.length-1;i++){

            int midIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[midIdx]>arr[j]){
                    midIdx=j;
                }
            }
            int temp=arr[midIdx];
            arr[midIdx]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
