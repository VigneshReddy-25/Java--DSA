package DSA.TwoPointers;

public class TwoSum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,9,10,11};
        int target=7;
        int left=0;
        int right=arr.length-1;
        boolean notfound=true;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
                notfound=false;
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
            else {
                right--;
            }
        }
        if(notfound) System.out.println("Not found");
    }
}
