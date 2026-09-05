package DSA.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
      int arr[]={1,3,5,6,7,8,1};
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
            System.out.println("duplicate: "+arr[i]);
            found=true;
            break;
          }
        }
        if(found){
          break;
        }
      }
      if(!found) System.out.println("No Element");
    }
}
