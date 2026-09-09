package DSA.Searching;

public class Findsqrt {
    public static void main(String args[]){
        int n=25;
        int low=1;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            
        }
        System.out.println("Square root of "+n+" is: "+ans);
    }    
}
