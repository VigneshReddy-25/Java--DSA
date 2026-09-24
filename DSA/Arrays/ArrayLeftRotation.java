package DSA.Arrays;

public class ArrayLeftRotation {
    public static void main(String[] args) {
      int arr[]={10,20,30,40,50};
      int k=2;
      for(int i=0;i<k;i++){
        int fe=arr[0];
        for(int j=1;j<arr.length;j++){
          arr[j-1]=arr[j];
        }
        arr[arr.length-1]=fe;
      }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
