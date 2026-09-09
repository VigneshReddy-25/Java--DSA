package DSA.Searching;

public class FindInsert {
    // public static void main(String args[]){
    //     int[] arr={1,3,4,5,6};
    //     int target=2;
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]>target && arr[mid-1]<target){
    //             System.out.println("Insert target at "+mid);
    //             return;
    //         }
    //         else if(arr[mid]>target){
    //             high=mid-1;
    //         }
    //         else {
    //             low=mid+1;
    //         }
    //     }
    // }


    public static void main(String args[]){
        int arr[]={1,3,4,5,6};
        int target=2;
    
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Insert target at "+low);
    }
}
