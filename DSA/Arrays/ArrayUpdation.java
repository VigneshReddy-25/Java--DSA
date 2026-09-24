package DSA.Arrays;

public class ArrayUpdation {
    public static void main(String args[]){
        int arr[]={10,20,20,40,50};
        int pos=2;
        int element=30;
        arr[pos]=element;
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
