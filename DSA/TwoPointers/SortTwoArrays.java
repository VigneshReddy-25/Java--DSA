package DSA.TwoPointers;

import java.util.Arrays;

public class SortTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
      int arr2[] = {2, 4, 6, 8,9};
      int n1=arr1.length;
      int n2=arr2.length;
      int merged[]=new int[n1+n2];
      int i=0,j=0,k=0;
      while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
          merged[k++]=arr1[i];
          i++;
        }
        else{
          merged[k++]=arr2[j];
          j++;
        }
      }
      while(i<n1){
        merged[k++]=arr1[i];
        i++;
      }
      while(j<n2){
        merged[k++]=arr2[j];
        j++;
      }
      System.out.println(Arrays.toString(merged));
    }
}
