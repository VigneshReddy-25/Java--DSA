package DSA.Arrays;

public class ArrayDeletion {
    public static void main(String args[]){
        int arr[]={12,14,16,19,25};
        int pos=2;
        int newArr[]=new int[arr.length-1];
        for(int i=0;i<pos;i++){
          newArr[i]=arr[i];
        }
        for(int i=pos;i<arr.length-1;i++){
          newArr[i]=arr[i+1];
        }
        for(int i=0;i<newArr.length;i++){
          System.out.print(newArr[i]+" ");
        }
    }
}
