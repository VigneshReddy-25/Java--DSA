package DSA.Arrays;

public class ArrayInsertion {
    public static void main(String args[]){
        int arr[]={12,14,16,19};
        int pos=2;
        int element=15;
        int arr1[]=new int[arr.length+1];
        for(int i=0;i<arr1.length;i++){
          if(i<pos){
            arr1[i]=arr[i];
          }
          else if(i==pos){
            arr1[i]=element;
          }
          else{
            arr1[i]=arr[i-1];
          }
        }
        for(int i=0;i<arr1.length;i++){
          System.out.print(arr1[i]+" ");
        }
    }
}
