package DSA.TwoPointers;

public class MoveZeroes {
    public static void main(String args[]){
        int  arr[]={0,1,0,3,0,12};
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[right]!=0){
                arr[left]=arr[right];
                arr[right]=0;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        for(int num:arr) System.out.print(num+" ");
    }
}
