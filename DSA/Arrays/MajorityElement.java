package DSA.Arrays;

public class MajorityElement {
    public static void main(String args[]){
        int arr[]={2,2,1,3,2,2,1,1,1,1,1,1};
        int n=arr.length;
        int count=0;
        int majorityElement=-1;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                majorityElement=arr[i];
                break;
            }
        }
        System.out.println(majorityElement);
    }
}
