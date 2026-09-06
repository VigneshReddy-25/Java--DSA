package DSA.Arrays;

public class MissingNumber {
    public static void main(String args[]){
        int arr[]={0,1,2,3,5,6,7,8,9};
        int n=arr.length;
        int totalSum= n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(totalSum-sum);
    }
}
