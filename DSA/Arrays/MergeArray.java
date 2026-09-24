package DSA.Arrays;

public class MergeArray {
    public static void main(String args[]){
    int arr1[]={11,37,63,83,93};
    int arr2[]={82,93,93,82,28};
    int n=arr1.length+arr2.length;
    int arr3[]=new int[n];
    int n1=0;
    for(int i=0;i<n;i++){
      if(i<n/2){
        arr3[i]=arr1[i];
      }
      else {
        arr3[i]=arr2[n1++];
      }
    }
    for(int num:arr3){
         System.out.print(num+" " );
    }
   
  }
}
