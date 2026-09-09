package DSA.Searching;

public class FirstOccurance {
    public static void main(String args[]){
        int arr[]={1,2,2,2,2,2,2,2,2,2,3,4};
        int target=2;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target && arr[mid-1]!=target){
                System.out.println("First Occurance of "+target +" is "+mid);
                return;
            }
            else if(arr[mid]==target &&arr[mid-1]==target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
    }
}
