package Shorting;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        int[]arr={9,5,3,0,7,4};

        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
