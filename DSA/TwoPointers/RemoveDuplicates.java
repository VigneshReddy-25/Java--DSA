package DSA1.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String at[]){
        int arr[]={1,2,3,3,4,4,5,6};
        int slow=0;
        int cnt=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
                cnt++;
            }
        }for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
           