package DSA.Searching;

public class FirstEven {
    public static void main(String args[]){
        int arr[]={15,19,10,7,94,63,20,63,30,40,50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("First even element is: "+arr[i]);
                return;
            }
        }
        System.out.println("No even element found");
    }
}
