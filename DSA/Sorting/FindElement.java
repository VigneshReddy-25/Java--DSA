package DSA.Sorting;

public class FindElement {
    public static void main(String args[]){
        int arr[]={10,7,94,63,20,63,30,40,50};
        int element=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
