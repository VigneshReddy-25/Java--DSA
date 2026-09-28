package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        int arr[]={2,5,9,3,7,4,11,13};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
