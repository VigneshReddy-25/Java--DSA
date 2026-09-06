package DSA.Arrays;

public class UniqueElements {
    public static void main(String args[]){
        int arr[]={10,20,10,30,20,40};
        for(int i=0;i<arr.length;i++){
          boolean nonrepeat=true;
          for(int j=0;j<arr.length;j++){
              if(arr[i]==arr[j] && i!=j){
                nonrepeat=false;
              }
          }
          if(nonrepeat){
            System.out.println(arr[i]);
          }
        }
    }
}
