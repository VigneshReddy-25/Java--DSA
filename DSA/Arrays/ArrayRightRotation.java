package DSA.Arrays;

public class ArrayRightRotation {
    public static void main(String[] args) {
      int arr[]={10,20,30,40,50};
      int n=arr.length;
      int k=2;
      for(int i=0;i<k;i++){
        int last=arr[n-1];
        for(int j=n-1;j>0;j--){
          arr[j]=arr[j-1];
        }
        arr[0]=last;
      }
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
      }
    }
}
