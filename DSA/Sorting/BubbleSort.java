package Sorting;
import java.util.Arrays;

public class BubbleSort{
    public static void main(String args[]){
        int arr[]={4,1,2,8,5};
        int n=arr.length;
        boolean swaped;
        for(int i=0;i<arr.length;i++){
            swaped=false;
            for(int j=0;j<n--;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
                
            }
            if(!swaped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}